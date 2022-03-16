package de.fherfurt.appointments.models;

import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Creator {
    private String name;
    private String mtrkNr;
    private List<Appointment> termine = new ArrayList<>();

    public Creator(String name, String mtrkNr) {
        this.name = name;
        this.mtrkNr = mtrkNr;
    }


    public void addAppointment(Appointment... appointments){
        this.termine.addAll(List.of(appointments));
    }

    public void delAppointment(Appointment... appointments){
        if (!this.termine.containsAll(List.of(appointments))) {
            return;
        }
        this.termine.removeAll(List.of(appointments));

    }

    public List<Appointment> getTermine() {
        return termine;
    }

    public String getName() {
        return name;
    }

    public String getMtrkNr() {
        return mtrkNr;
    }

    public Appointment createAppointment(String name, LocalDateTime date, Repetition repetition, Campus campusLocation, String room, String description){
        Appointment appointment = new Appointment(name,this,date,repetition,campusLocation,room,description);
        addAppointment(appointment);
        return appointment;
    }
}

