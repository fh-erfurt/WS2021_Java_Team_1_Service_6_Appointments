package de.fherfurt.appointments.searching;


import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.models.Creator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FindBy {

    List<Appointment> inputAppointmentList;


    public FindBy(List<Appointment> appointmentList) {
        this.inputAppointmentList = appointmentList;
    }

    public List<Appointment> FindById (int inputId){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getId() == inputId)
                .collect(Collectors.toList());
    }

    public List<Appointment> FindByName (String inputName){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getName().startsWith(inputName))
                .collect(Collectors.toList());
    }

    public List<Appointment> FindByDate (LocalDateTime inputDate){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getDate().equals(inputDate))
                .collect(Collectors.toList());
    }

    public List<Appointment> FindByCreator (Creator inputCreator){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getCreator().equals(inputCreator))
                .collect(Collectors.toList());
    }

    public List<Appointment> FindByCampus (Campus inputCampus){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getCampusLocation().equals(inputCampus))
                .collect(Collectors.toList());
    }



}
