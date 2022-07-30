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

        //  Appointments
        Appointment appointment01 = new Appointment("Java 2", "Avemarg", LocalDateTime.now(), "weekly", "Altonaer Straße", "5.1.05", "Vorlesung Programmierung Java 2", null);
        Appointment appointment02 = new Appointment("Embedded Systems", "Bischoff", LocalDateTime.now(), "monthly", "Altonaer Straße", "9.1.06", "Vorlesung Embedded Systems", null);
        Appointment appointment03 = new Appointment("Graphentheorie", "Haußen", LocalDateTime.now(), "daily", "Altonaer Straße", "6.2.05", "Vorlesung Graphentheorie", null);
        Appointment appointment04 = new Appointment("Softwaretechnik 2", "Spaethe", LocalDateTime.now(), "monthly", "Altonaer Straße", "8.1.10", "Vorlesung Softwaretechnik 2", null);
        Appointment appointment05 = new Appointment("Automation Anwendung", "Schorcht", LocalDateTime.now(), "weekly", "Altonaer Straße", "1.1.12", "Vorlesung Automation Anwendung", null);


        List<Person> persons = new ArrayList<>();

        //  Personen
        Person person01 = new Person("Klaus", "Peter", "klaus.peter@fh-erfurt.de", null);
        Person person02 = new Person("Fridolin", "Elefant", "Fridolin.Elefant@fh-erfurt.de", null);
        Person person03 = new Person("Maxim", "Eimer", "m.e@fh-erfurt.de", null);
        Person person04 = new Person("Mercedes", "Augustini", "Mercedes.Augustini@fh-erfurt.de", null);
        Person person05 = new Person("Frank", "Zander", "Frank.Zander@fh-erfurt.de", null);


        // Persons List
        persons.add(person01);
        persons.add(person02);
        persons.add(person03);
        persons.add(person04);
        persons.add(person05);


        // Result List
        result.add(appointment01);
        result.add(appointment02);
        result.add(appointment03);
        result.add(appointment04);
        result.add(appointment05);


        // Bei Persons die Appointments hinzufügen
        persons.forEach(person -> person.setAppointments( result ));

        // Bei Appointments die Persons hinzufügen
        result.forEach(app -> app.setPersons( persons ));


        return result;
    }
}
