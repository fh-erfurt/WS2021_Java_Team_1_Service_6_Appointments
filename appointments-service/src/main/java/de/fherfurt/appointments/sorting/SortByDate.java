package de.fherfurt.appointments.sorting;

import de.fherfurt.appointments.main.Appointment;

import java.util.Comparator;

public class SortByDate implements Comparator<Appointment> {
    @Override
    public int compare(Appointment a, Appointment b){
        return a.getDate().compareTo(b.getDate());
    }
}
