package de.fherfurt.appointments.storage.core;

import de.fherfurt.appointments.main.Appointment;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataController {

    private static final String PERSISTENCE_UNIT_NAME = "appointment-unit";

    private final EntityManagerFactory entityManagerFactory;

    /*
        Singleton definition
     */
    private static DataController instance;

    public static DataController getInstance()
    {
        if( instance == null )
            instance = new DataController();

        return instance;
    }

    /*
        Private Constructor
     */

    private DataController()
    {
        this.entityManagerFactory = Persistence.createEntityManagerFactory( PERSISTENCE_UNIT_NAME );
    }

    /*
        Dao Getter
     */

    public IGenericDao<Appointment> getAppointmentDao()
    {
        return new JpaGenericDao<>( Appointment.class,
                this.entityManagerFactory.createEntityManager() );
    }
}
