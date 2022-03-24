package de.fherfurt.appointments.sorting;

import de.fherfurt.appointments.main.Appointment;

import java.util.Comparator;
import java.util.List;

/**
 * Class that allows to sort a {@link List<Appointment>}
 *
 * @author Jonas Helmboldt
 */
public class SortBy {

    List<Appointment> inputAppointmentList;

    public SortBy(List<Appointment> appointmentList) {
        this.inputAppointmentList = appointmentList;
    }

    /**
     * Function that sorts a {@link List<Appointment>} by date
     *
     * @return sorted {@link List<Appointment>}
     * @author Jonas Helmboldt
     */
    public List<Appointment> SortByDate(){
      inputAppointmentList.sort(Comparator.comparing(Appointment::getDate));

      return inputAppointmentList;
    }

    /**
     * Function that sorts a {@link List<Appointment>} by creator name
     *
     * @return sorted {@link List<Appointment>}
     * @author Jonas Helmboldt
     */
    public List<Appointment> SortByCreatorName(){
        inputAppointmentList.sort((Appointment a1, Appointment a2) -> {
            return a1.getCreator().getName().compareToIgnoreCase(a2.getCreator().getName());
        });

        return inputAppointmentList;
    }

    /**
     * Function that sorts a {@link List<Appointment>} by campus
     *
     * @return sorted {@link List<Appointment>}
     * @author Jonas Helmboldt
     */
    public List<Appointment> SortByCampus(){
        inputAppointmentList.sort((Appointment a1, Appointment a2) -> {
            return a1.getCampusLocation().compareTo(a2.getCampusLocation());
        });

        return inputAppointmentList;
    }
}
