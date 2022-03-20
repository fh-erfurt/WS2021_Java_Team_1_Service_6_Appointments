package de.fherfurt.appointments.main;

import de.fherfurt.appointments.models.Professor;
import de.fherfurt.appointments.models.Student;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * //@param registerStudent
 */

/*
*/
public class AppointmentManager {
    private HashMap<Professor,Appointment> terminListeAllerProfessoren = new HashMap<>();
    public static void  registerStudent(Appointment appointment, Student student){
        appointment.addParticipant(student);
        student.addAppointment(appointment);
    }
    public static void  unsignedStudent(Appointment appointment,  Student student){
        appointment.unsignedParticipant(student);
        student.delAppointment(appointment);
    }

    public static void  registerProfessor(Appointment appointment, Professor professor){
       professor.addAppointment(appointment);
    }
    public static void  unsignedProfessor(Appointment appointment, Professor professor){
        professor.delAppointment(appointment);
    }
    public static void delAppointment(){

    }
    public void registerAppointment(String name, Professor creator, LocalDateTime date, Repetition repetition, Campus campusLocation, String room, String description){
            Appointment appointment = new Appointment(name, creator, date, repetition, campusLocation, room, description);
    }


}


