package de.fhe.ai.appointment.storage.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositoryFactory {

    private static final String PERSISTENCE_UNIT_NAME = "appointment-unit";

    private final EntityManagerFactory entityManagerFactory;
    private final RepositoryImpl repository;

    private static RepositoryFactory INSTANCE;

    public static RepositoryFactory getInstance() {
        if( INSTANCE == null )
            INSTANCE = new RepositoryFactory();

        return INSTANCE;
    }

    private RepositoryFactory(){
        this.entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        this.repository = new RepositoryImpl();

        //TODO: Dataprovider einfügen
        / Create Test Data
        LOGGER.info( "Create Test Data" );
        DataProvider.createTestData().forEach( this.repository::createAppointment );
    }

    public AppointmentRepository getAppointmentRepository(){
        return this.repository;
    }
    public PersonRepository getPersonRepository(){
        return this.repository;
    }

    private AppointmentDao getAppointmentDao(){
        return new JPAAppointmentDao(this.entityManagerFactory.createEntityManager());
    }

    private PersonDao getPersonDao(){
        return new JPAPersonDao(this.entityManagerFactory.createEntityManager());

    }
}
