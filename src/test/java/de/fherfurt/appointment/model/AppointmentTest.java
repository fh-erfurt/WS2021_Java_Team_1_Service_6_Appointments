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


    @Test
    public void testEquals() throws Exception
    {

        Assert.assertNotNull( "Not Null - appointment should not be null", appointment );

        Assert.assertEquals( "person should be equal to itself", appointment, appointment );

        Assert.assertFalse( "Two different appointment should never be equal",
                appointment.equals( new Appointment( Constants.SECOND_APPOINTMENT_NAME,
                        Constants.SECOND_APPOINTMENT_CREATOR, Constants.SECOND_APPOINTMENT_DATE,
                        Constants.SECOND_APPOINTMENT_REPITITON,Constants.SECOND_APPOINTMENT_STREET,
                        Constants.SECOND_APPOINTMENT_ROOM,Constants.SECOND_APPOINTMENT_DESCRIPTION) ) ) );

        Assert.assertSame( "It should be true that appointment == appointment ", appointment, appointment );

        Assert.assertNotSame( "It should not be true that appointment == other_appointment",
                appointment,
                new Appointment( Constants.FIRST_APPOINTMENT_NAME,
                        Constants.FIRST_APPOINTMENT_CREATOR, Constants.FIRST_APPOINTMENT_DATE,
                        Constants.FIRST_APPOINTMENT_REPITITON,Constants.FIRST_APPOINTMENT_STREET,
                        Constants.FIRST_APPOINTMENT_ROOM,Constants.FIRST_APPOINTMENT_DESCRIPTION) ) );
    }
}
