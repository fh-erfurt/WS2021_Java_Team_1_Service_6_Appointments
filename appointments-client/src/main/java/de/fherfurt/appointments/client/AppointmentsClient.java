package de.fherfurt.appointments.client;

import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;


import java.util.List;
import java.util.Optional;

/**
 * this interface defines the provided functionalities of the appointments-client
 * can be used by other services
 *
 * @author Jonas Helmboldt
 */
public interface AppointmentsClient {

    //public List<NewsAppointment> getAppointByName(String name);

    /**
     * takes an id and searches for a corresponding appointment
     * if a corresponding appointment is found, it will return a {@link NewsAppointment}, else an empty {@link Optional}
     * @param id the ID of the appointment
     * @return found news appointment or empty optional
     *
     * @author Jonas Helmboldt
     */
    public Optional<NewsAppointment> getAppointmentById(int id);

    /**
     * takes a name and searches for a corresponding appointment
     * if a corresponding appointment is found, it will return a {@link NewsAppointment}, else an empty {@link Optional}
     * @param name the name of the appointment
     * @return found news appointment or empty optional
     *
     * @author Jonas Helmboldt
     */
    public Optional<NewsAppointment> getAppointmentByName(String name);
}
