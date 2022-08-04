package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.util.DataProvider;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

/**
 * The classRepository factory.
 */
public class RepositoryFactory {
    private static final Logger LOGGER = Logger.getLogger( RepositoryFactory.class.getSimpleName() );

    private static final String PERSISTENCE_UNIT_NAME = "appointment-unit";

    private final EntityManagerFactory entityManagerFactory;
    private final RepositoryImpl repository;

    private static RepositoryFactory INSTANCE;

    /**
     * Gets instance.
     *
     * @return the instance
     */
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

    /**
     * Gets person repository.
     *
     * @return the person repository
     */
    public PersonRepository getPersonRepository() {
        return this.repository;
    }

    /**
     * Gets appointment repository.
     *
     * @return the appointment repository
     */
    public AppointmentRepository getAppointmentRepository() {
        return this.repository;
    }

    /**
     * Gets person dao.
     *
     * @return the person dao
     */
    public JPAPersonDao getPersonDao() {
        return new JPAPersonDao( this.entityManagerFactory.createEntityManager() );
    }

    /**
     * Gets appointment dao.
     *
     * @return the appointment dao
     */
    public JPAAppointmentDao getAppointmentDao() {
        return new JPAAppointmentDao( this.entityManagerFactory.createEntityManager() );
    }
}
