package de.fherfurt.appointments.models;

import de.fherfurt.appointments.main.Appointment;

public class Professor extends Creator {


    public Professor(String name, String mtrkNr) {
        super(name,mtrkNr);

    }
    public void informStudents(Appointment appointment, String message){
        if (!getTermine().contains(appointment)){
            return;
        }
        Appointment found = null;

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
