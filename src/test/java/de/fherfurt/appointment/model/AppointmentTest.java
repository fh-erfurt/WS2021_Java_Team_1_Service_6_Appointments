package de.fherfurt.appointment.model;


import de.fherfurt.appointment.Constants;
import de.fherfurt.appointment.models.Appointment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * class AppointmentTest check an appointment if its equal to another appointment.
 * @author teichmueller
 */

public class AppointmentTest {

    private Appointment appointment;

    @Before
    public void setUp() throws Exception
    {
        appointment = new Appointment( Constants.FIRST_APPOINTMENT_NAME,
                Constants.FIRST_APPOINTMENT_CREATOR, Constants.FIRST_APPOINTMENT_DATE,
                Constants.FIRST_APPOINTMENT_REPITITON,Constants.FIRST_APPOINTMENT_STREET,
                Constants.FIRST_APPOINTMENT_ROOM,Constants.FIRST_APPOINTMENT_DESCRIPTION);
    }



}
