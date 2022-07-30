package de.fhe.ai.appointment.util;

import de.fhe.ai.appointment.model.Appointment;
import de.fhe.ai.appointment.model.Person;
import de.fhe.ai.appointment.storage.repository.PersonDao;
import org.hibernate.type.LocalDateType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

       public static List<Appointment> createTestData()
    {
        List<Appointment> result = new ArrayList<>();

        // Einzelne Appointments erstellen
        Appointment appointment01 = new Appointment("Java 2", "Avemarg", LocalDateTime.now(), "weekly", "Altonaer Straße", "5.1.05", "Vorlesung Programmierung Java 2", null);
        // Appointments ergänzen +5

        List<Person> persons = new ArrayList<>();

        // Einzelne Personen erstellen
        Person person01 = new Person("Klaus", "Peter", "klaus.peter@fh-erfurt.de", null);
        // Persons ergänzen +5

        // Persons Liste befüllen
        persons.add(person01);
        //...

        // Result Liste befüllen
        result.add(appointment01);
        //...

        // Bei Persons die Appointments hinzufügen
        persons.forEach(person -> person.setAppointments( result ));

        // Bei Appointments die Persons hinzufügen
        result.forEach(app -> app.setPersons( persons ));


        return result;




        /*List<Person> personList = new ArrayList<>();

        //TODO: find the correct Format for "date"
        Appointment appointment01 = new Appointment("Java");
        Appointment appointment02 = new Appointment();
        Appointment appointment03= new Appointment();
        Appointment appointment04 = new Appointment();
        Appointment appointment05 = new Appointment();








        personList.add( new Person( "Max",    "Mustermann",   "m.m@m.com",        appointment01 ) );
        personList.add( new Person( "Michal", "Mustermann",   "m.muster@m.com",   appointment02 ) );
        personList.add( new Person( "Martin", "Schmidt",      "m.s@m.com",        appointment03 );
        personList.add( new Person( "Volker", "Schulz",       "v.s@m.com",        appointment04 ) );
        personList.add( new Person( "Hans",   "Meier",        "hans.m@m.com",     appointment05 ) );
        personList.add( new Person( "Gabi",   "Mustermann",   "g.m@m.com",        appointment02 ) );
        personList.add( new Person( "Heike",  "Meier",        "h.m@m.com",        appointment04 ) );

        return personList;*/
    }
}
