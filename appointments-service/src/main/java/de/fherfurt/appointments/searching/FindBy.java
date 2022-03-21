package de.fherfurt.appointments.searching;


import de.fherfurt.appointments.main.Appointment;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FindBy {

    public FindBy(List<Appointment> appointmentList) {
    }

    public List<Appointment> FindByName (List<Appointment> appointmentList, String inputName){

        List<Appointment> filteredAppointment = appointmentList.stream()
                .filter(appointment -> appointment.getName().startsWith(inputName))
                .collect(Collectors.toList());

        return filteredAppointment;
    }

}
