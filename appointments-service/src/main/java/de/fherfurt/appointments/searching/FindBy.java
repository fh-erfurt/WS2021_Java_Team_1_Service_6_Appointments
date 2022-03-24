package de.fherfurt.appointments.searching;


import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.models.Creator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that allows to search for an {@link Appointment} in a {@link List<Appointment>}
 *
 * @author Jonas Helmboldt
 */
public class FindBy {

    List<Appointment> inputAppointmentList;


    public FindBy(List<Appointment> appointmentList) {
        this.inputAppointmentList = appointmentList;
    }

    /**
     * Function which searches a {@link List<Appointment>} for an id
     *
     * @param inputId as a search requirement
     * @return found {@link Appointment} or null if no {@link Appointment} was found
     * @author Jonas Helmboldt
     */
    public Appointment FindById (int inputId){

        return inputAppointmentList.stream()
                .filter(appointment -> inputId == appointment.getId())
                .findAny()
                .orElse(null);
    }

    /**
     * Function which searches a {@link List<Appointment>} for a name
     *
     * @param inputName as a search requirement
     * @return {@link Appointment} found in a {@link List<Appointment>}
     * @author Jonas Helmboldt
     */
    public List<Appointment> FindByName (String inputName){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getName().startsWith(inputName))
                .collect(Collectors.toList());
    }

    /**
     * Function which searches a {@link List<Appointment>} for a date
     *
     * @param inputDate as a search requirement
     * @return {@link Appointment} found in a {@link List<Appointment>}
     * @author Jonas Helmboldt
     */
    public List<Appointment> FindByDate (LocalDateTime inputDate){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getDate().equals(inputDate))
                .collect(Collectors.toList());
    }

    /**
     * Function which searches a {@link List<Appointment>} for a creator
     *
     * @param inputCreator as a search requirement
     * @return {@link Appointment} found in a {@link List<Appointment>}
     * @author Jonas Helmboldt
     */
    public List<Appointment> FindByCreator (Creator inputCreator){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getCreator().equals(inputCreator))
                .collect(Collectors.toList());
    }

    /**
     * Function which searches a {@link List<Appointment>} for a campus
     *
     * @param inputCampus as a search requirement
     * @return {@link Appointment} found in a {@link List<Appointment>}
     * @author Jonas Helmboldt
     */
    public List<Appointment> FindByCampus (Campus inputCampus){

        return inputAppointmentList.stream()
                .filter(appointment -> appointment.getCampusLocation().equals(inputCampus))
                .collect(Collectors.toList());
    }



}
