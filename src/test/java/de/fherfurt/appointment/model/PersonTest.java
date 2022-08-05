package de.fherfurt.appointment.model;

import de.fherfurt.appointment.Constants;
import de.fherfurt.appointment.models.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PersonTest {
    private Person person;

    @Before
    public void setUp() throws Exception
    {
        person = new Person( Constants.FIRST_PERSON_FIRSTNAME,
                Constants.FIRST_PERSON_LASTNAME, Constants.FIRST_PERSON_MAIL);
    }


    @Test
    public void testEquals() throws Exception
    {

        Assert.assertNotNull( "Not Null - person should not be null", person );

        Assert.assertEquals( "person should be equal to itself", person, person );

        Assert.assertFalse( "Two different persons should never be equal",
                person.equals( new Person( Constants.SECOND_PERSON_FIRSTNAME,
                        Constants.SECOND_PERSON_LASTNAME, Constants.SECOND_PERSON_MAIL ) ) );

        Assert.assertSame( "It should be true that person == person ", person, person );

        Assert.assertNotSame( "It should not be true that person == other_person",
                person,
                new Person( Constants.FIRST_PERSON_FIRSTNAME,
                        Constants.FIRST_PERSON_LASTNAME, Constants.FIRST_PERSON_MAIL ) );
    }
}
