package de.fherfurt.appointments.sorting;

import de.fherfurt.appointments.main.Appointment;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBy {

    List<Appointment> inputAppointmentList;

    public SortBy(List<Appointment> appointmentList) {
        this.inputAppointmentList = appointmentList;
    }

    public List<Appointment> SortByDate(){
      inputAppointmentList.sort(Comparator.comparing(Appointment::getDate));

      return inputAppointmentList;
    }

    public List<Appointment> SortByCreatorName(){
        inputAppointmentList.sort((Appointment a1, Appointment a2) -> {
            return a1.getCreator().getName().compareToIgnoreCase(a2.getCreator().getName());
        });

        return inputAppointmentList;
    }

    public List<Appointment> SortByCampus(){
        inputAppointmentList.sort((Appointment a1, Appointment a2) -> {
            return a1.getCampusLocation().compareTo(a2.getCampusLocation());
        });

        return inputAppointmentList;
    }
}
