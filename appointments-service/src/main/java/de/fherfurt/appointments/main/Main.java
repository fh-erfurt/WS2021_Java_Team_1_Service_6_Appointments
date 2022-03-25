package de.fherfurt.appointments.main;

import de.fherfurt.appointments.mapper.AppointmentMapper;
import de.fherfurt.appointments.models.Professor;
import de.fherfurt.appointments.models.Student;
import de.fherfurt.appointments.searching.AppointmentInterfaceFunctions;
import de.fherfurt.appointments.searching.FindBy;
import de.fherfurt.appointments.sorting.SortBy;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;



/**
 *
 */
public class Main {



    public static void main(String[] args){
        String nr = "12345";
        Professor prof1 = new Professor("Udo", nr);
        Professor prof2 = new Professor("Hans", nr);
        Professor prof3 = new Professor("Dominic", nr);

        Student student1 = new Student("Franz", nr);
        Student student2 = new Student("Steffen", nr);
        Student student3 = new Student("Michelle", nr);
        Student student4 = new Student("Hans", nr);
        Student student5 = new Student("Lukas", nr);
        Student student6 = new Student("Fridolin", nr);

        LocalDateTime date = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.of(1,1,1,1,1);
        Appointment test = prof1.createAppointment("THI", date, Repetition.DAILY, Campus.LEIPZIGERCAMPUS, "Hallo", "Test");
        Appointment test2 = prof2.createAppointment("MA", date2, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestTEST HALLO", "Test");
        Appointment test3 = prof2.createAppointment("MA", date2, Repetition.DAILY, Campus.SCHLUETERCAMPUS, "TestTEST HALLO", "Test");
        Appointment test4 = prof3.createAppointment("MA", date2, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestTEST HALLO", "Test");
        Appointment test5 = prof2.createAppointment("MA", date2, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestTEST HALLO", "Test");


        //Manager
        AppointmentManager.registerStudent(test, student1);
        AppointmentManager.registerStudent(test, student2);
        AppointmentManager.registerStudent(test, student3);
        AppointmentManager.registerStudent(test, student5);
        AppointmentManager.registerStudent(test, student6);

        prof1.informStudents(test, "Der Test morgen fällt aus.");

        List<Appointment> appointmentList = new ArrayList<>();

        appointmentList.add(test);
        appointmentList.add(test2);
        appointmentList.add(test3);
        appointmentList.add(test4);
        appointmentList.add(test5);

        System.out.println(appointmentList.get(1).getDate());


        FindBy filter = new FindBy(appointmentList);

        LocalDateTime testDate = LocalDateTime.of(1,1,1,1,1);

        System.out.println(filter.FindByName("THI"));
        System.out.println(test.getName() + " " + test.getDate());
        System.out.println(filter.FindByCreator(prof1));
        System.out.println(filter.FindByDate(testDate));
        System.out.println(filter.FindById(0));

        filter.FindByName("THI");

        AppointmentMapper mapper = new AppointmentMapper();

        System.out.println(mapper.NewsAppointmentMapper(test).getPlace());

        SortBy sorting = new SortBy(appointmentList);

        AppointmentInterfaceFunctions interfaceFunctions = new AppointmentInterfaceFunctions(appointmentList);

        System.out.println(interfaceFunctions.getAppointmentById(1));
        System.out.println(interfaceFunctions.getAppointmentByName("Aff"));
        System.out.println(filter.FindByName("AFF"));



    }


    public static void printList(List<Appointment> app) {
        for(Appointment ap : app) {
            System.out.println(ap.getDate() + " " + ap.getCreator().getName() + " " + ap.getCampusLocation() + " " + ap.getId() + " " + ap.getRoom() + " " + ap.getName());
        }

    }

}
