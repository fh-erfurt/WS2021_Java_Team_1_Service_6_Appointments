package de.fherfurt.appointments.client;

import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;


import java.time.LocalDateTime;
import java.util.Optional;

/**
 * this interface defines the provided functionalities of the appointments-client
 * can be used by other services
 *
 * @author Jonas Helmboldt
 */
public interface AppointmentsClient {

    int createAppointment(String name, int creator, LocalDateTime date, String repetition, String campusLocation, String room, String description);

    void deleteAppointment(int id);
    void addParticipant(int appointmentId, int participantId);
    void removeParticipant(int appointmentId, int participantId);

    /**
     * takes an id and searches for a corresponding appointment
     * if a corresponding appointment is found, it will return a {@link NewsAppointment}, else an empty {@link Optional}
     * @param id the ID of the appointment
     * @return found news appointment or empty optional
     *
     * @author Jonas Helmboldt
     */
    Optional<NewsAppointment> getAppointmentById(int id);

    /**
     * takes a name and searches for a corresponding appointment
     * if a corresponding appointment is found, it will return a {@link NewsAppointment}, else an empty {@link Optional}
     * @param name the name of the appointment
     * @return found news appointment or empty optional
     *
     * @author Jonas Helmboldt
     */
    Optional<NewsAppointment> getAppointmentByName(String name);
}
