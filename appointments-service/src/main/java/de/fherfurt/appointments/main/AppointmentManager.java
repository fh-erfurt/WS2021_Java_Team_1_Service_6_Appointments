package de.fherfurt.appointments.main;

import de.fherfurt.appointments.models.Professor;
import de.fherfurt.appointments.models.Student;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.HashMap;


public class AppointmentManager {
    /**
     * insert all appointments in contact with the professor in the list
     * @author stephan teichmueller
     */
    private HashMap<Professor,Appointment> terminListeAllerProfessoren = new HashMap<>();

    /**
     * register a student in the list of appointment
     * @param appointment name of the appointment
     * @param student  name of the student
     * @author stephan teichmueller
     */
    public static void  registerStudent(Appointment appointment, Student student){
        appointment.addParticipant(student);
        student.addAppointment(appointment);
    }

    /**
     * remove a student from list
     *@author stephan teichmueller
     */
    public static void  unsignedStudent(Appointment appointment,  Student student){
        appointment.unsignedParticipant(student);
        student.delAppointment(appointment);
    }

    /**
     * register a Professor as an organizer to an appointment
     * @param appointment
     * @param professor name of the Employee
     * @author stephan teichmueller
     */

    public static void  registerProfessor(Appointment appointment, Professor professor){
       professor.addAppointment(appointment);
    }

    /**
     * delete the appointment
     * @param appointment
     * @param professor
     * @author stephan teichmueller
     */
    public static void  unsignedProfessor(Appointment appointment, Professor professor){
        professor.delAppointment(appointment);
    }

    /**
     * create a new appointment
     * @param name
     * @param creator
     * @param date
     * @param repetition
     * @param campusLocation
     * @param room
     * @param description
     * @author stephan teichmueller
     */

    public void registerAppointment(String name, Professor creator, LocalDateTime date, Repetition repetition, Campus campusLocation, String room, String description){
            Appointment appointment = new Appointment(name, creator, date, repetition, campusLocation, room, description);
    }


}


