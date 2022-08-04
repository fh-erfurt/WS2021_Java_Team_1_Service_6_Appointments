package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.util.DataProvider;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

public class RepositoryFactory {
    private static final Logger LOGGER = Logger.getLogger( RepositoryFactory.class.getSimpleName() );

    private static final String PERSISTENCE_UNIT_NAME = "appointment-unit";

    private final EntityManagerFactory entityManagerFactory;
    private final RepositoryImpl repository;

    private static RepositoryFactory INSTANCE;

    public static RepositoryFactory getInstance() {
        if( INSTANCE == null )
            INSTANCE = new RepositoryFactory();

        return INSTANCE;
    }

    private RepositoryFactory() {
        LOGGER.info( "Init Data Controller" );

        // Prepare Entity Manager Factory
        this.entityManagerFactory = Persistence.createEntityManagerFactory( PERSISTENCE_UNIT_NAME );

        // Create Repository
        LOGGER.info( "Create RepositoryImpl" );
        this.repository = new RepositoryImpl( this.getPersonDao(), this.getAppointmentDao() );

        // Create Test Data
        LOGGER.info( "Create Test Data" );
        DataProvider.createTestData().forEach( this.repository::createAppointment );
    }

    public PersonRepository getPersonRepository() {
        return this.repository;
    }

    public AppointmentRepository getAppointmentRepository() {
        return this.repository;
    }

    public JPAPersonDao getPersonDao() {
        return new JPAPersonDao( this.entityManagerFactory.createEntityManager() );
    }

    public JPAAppointmentDao getAppointmentDao() {
        return new JPAAppointmentDao( this.entityManagerFactory.createEntityManager() );
    }
}
