package de.fherfurt.appointments.main;

import de.fherfurt.appointments.models.Professor;
import de.fherfurt.appointments.models.Student;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

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

        LocalDateTime date  = null;
        Appointment test = prof1.createAppointment("THI", date, Repetition.DAILY, Campus.ALTONAERCAMPUS, "Hallo", "Test");

        //Händisch -> wird vom Manager übernommen.
        student1.addAppointment(test);
        test.addParticipant(student1);

        //Manager
        AppointmentManager.registerStudent(test, student1);
        AppointmentManager.registerStudent(test, student2);
        AppointmentManager.registerStudent(test, student3);
        AppointmentManager.registerStudent(test, student5);
        AppointmentManager.registerStudent(test, student6);

        prof1.informStudents(test, "Der Test morgen fällt aus.");

    }
}
