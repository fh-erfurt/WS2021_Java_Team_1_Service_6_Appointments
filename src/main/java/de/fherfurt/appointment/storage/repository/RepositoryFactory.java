package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.util.DataProvider;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

/**
 * manage database connection
 *
 * @author helmboldt
 */
public class RepositoryFactory {

    private static final Logger LOGGER = Logger.getLogger(RepositoryFactory.class.getSimpleName());

    private static final String DEV_PERSISTENCE_UNIT_NAME = "appointment-unit-dev";
    private static final String PRODUCTION_PERSISTENCE_UNIT_NAME = "appointment-unit-production";

    private final EntityManagerFactory entityManagerFactory;
    private final RepositoryImpl repository;

    private static RepositoryFactory INSTANCE;

    public static RepositoryFactory getInstance() {
        if (INSTANCE == null)
            INSTANCE = new RepositoryFactory();

        return INSTANCE;
    }

    private RepositoryFactory() {
        // Prepare Entity Manager Factory
        this.entityManagerFactory = prepareEntityManagerFactory();

        // Create Repo
        this.repository = new RepositoryImpl(this.getPersonDao(), this.getAppointmentDao());

        //Create Test Data
        LOGGER.info("Create Test Data");
        DataProvider.createTestData().forEach(this.repository::createAppointment);
    }

    private EntityManagerFactory prepareEntityManagerFactory() {
        LOGGER.info("Prepare Enitiy Manager Factory");
        String runMode = System.getenv("RUN_MODE");

        if (runMode == null || runMode.equalsIgnoreCase("dev")) {
            LOGGER.info("RUN_MODE: dev");
            return Persistence.createEntityManagerFactory(DEV_PERSISTENCE_UNIT_NAME);
        } else {
            LOGGER.info("RUN_MODE: production");
            return Persistence.createEntityManagerFactory(PRODUCTION_PERSISTENCE_UNIT_NAME);
        }
    }

    public AppointmentRepository getAppointmentRepository() {
        return this.repository;
    }

    public PersonRepository getPersonRepository() {
        return this.repository;
    }

    private AppointmentDao getAppointmentDao() {
        return new JPAAppointmentDao(this.entityManagerFactory.createEntityManager());
    }

    private PersonDao getPersonDao() {
        return new JPAPersonDao(this.entityManagerFactory.createEntityManager());

    }
}
