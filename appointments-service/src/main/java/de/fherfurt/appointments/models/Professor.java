package de.fherfurt.appointments.models;

import de.fherfurt.appointments.main.Appointment;

public class Professor extends Creator {

    /**
     * the class from professor inheritance from class creator
     * @param name
     * @param mtrkNr matriculation number
     * @author stephan teichmueller
     */

    public Professor(String name, String mtrkNr) {
        super(name,mtrkNr);

    }

    /**
     * inform all students, if the appointment is closed
     * @param appointment current appointment
     * @param message for information to all participants
     * @author stephan teichmueller
     */
    public void informStudents(Appointment appointment, String message){
        if (!getTermine().contains(appointment)){
            return;
        }
        //Appointment found = null;

        for (Appointment termin:getTermine()) {
            if (termin.equals(appointment)){
                for (Student student : termin.getParticipants()) {
                    System.out.println(student.getName() + "| Informed with: " + message);
                }
                break;
            }
        }
    }





}
