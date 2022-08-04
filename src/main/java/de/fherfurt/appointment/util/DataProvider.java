package de.fherfurt.appointment.util;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataProvider {

       public static List<Appointment> createTestData()
    {

      List<Appointment> appointmentList= new ArrayList<>();

        Person person01 = new Person("Klaus", "Peter", "klaus.peter@fh-erfurt.de");
        Person person02 = new Person("Fridolin", "Elefant", "Fridolin.Elefant@fh-erfurt.de");
        Person person03 = new Person("Maxim", "Eimer", "m.e@fh-erfurt.de");
        Person person04 = new Person("Mercedes", "Augustini", "Mercedes.Augustini@fh-erfurt.de");
        Person person05 = new Person("Frank", "Zander", "Frank.Zander@fh-erfurt.de");

        List<Person> personList1 = new ArrayList<>();

        List<Person> personList2 = new ArrayList<>();

        personList1.add(person01);
        personList1.add(person03);
        personList1.add(person05);

        personList2.add(person02);
        personList2.add(person04);

        appointmentList.add(new Appointment("Java 2", "Avemarg", new Date(), "weekly", "Altonaer Straße", "5.1.05", "Vorlesung Programmierung Java 2", personList1));
        appointmentList.add(new Appointment("Embedded Systems", "Bischoff", new Date(), "monthly", "Altonaer Straße", "9.1.06", "Vorlesung Embedded Systems", personList2));
        appointmentList.add(new Appointment("Graphentheorie", "Haußen", new Date(), "daily", "Altonaer Straße", "6.2.05", "Vorlesung Graphentheorie", personList1));
        appointmentList.add(new Appointment("Softwaretechnik 2", "Spaethe", new Date(), "monthly", "Altonaer Straße", "8.1.10", "Vorlesung Softwaretechnik 2", personList2));
        appointmentList.add(new Appointment("Automation Anwendung", "Schorcht", new Date(), "weekly", "Altonaer Straße", "1.1.12", "Vorlesung Automation Anwendung", personList2));

        return appointmentList;


    }
}
