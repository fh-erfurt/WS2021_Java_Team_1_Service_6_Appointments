package de.fherfurt.appointment.model;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * test appointment functions
 *
 * @author helmboldt
 */

public class AppointmentTest {

    private Appointment appointment;
    private Person person;
    private List<Person> personList;

    @Before
    public void setUp() throws Exception {
        appointment = new Appointment();
        person = new Person("Klaus", "Peter", "klaus.peter@fh-erfurt.de");
        personList = new ArrayList<>();

    }

    @Test
    public void testHasPerson() throws Exception {
        person.setId((long) 1);
        personList.add(person);
        appointment = new Appointment("Java 2", "Avemarg", new Date(), "weekly", "Altonaer Straße", "5.1.05", "Vorlesung Programmierung Java 2", personList);

        Assert.assertTrue(appointment.hasPerson(1));
        Assert.assertFalse(appointment.hasPerson(0));
    }


}
