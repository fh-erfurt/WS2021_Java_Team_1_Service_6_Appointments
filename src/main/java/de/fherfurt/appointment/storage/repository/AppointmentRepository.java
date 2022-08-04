package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;
import de.fherfurt.appointment.models.SortCriteriaEnum;

import java.util.List;

/**
 * The interface Appointment repository.
 */
public interface AppointmentRepository {

    /**
     * Gets all appointments.
     *
     * @return the all appointments
     */
    List<Appointment> getAllAppointments();

    /**
     * Gets appointment.
     *
     * @param appointmentId the appointment id
     * @return the appointment
     */
    Appointment getAppointment(Long appointmentId);

    /**
     * Create appointment boolean.
     *
     * @param appointment the appointment
     * @return the boolean
     */
    boolean createAppointment(Appointment appointment);

    /**
     * Update appointment boolean.
     *
     * @param appointment the appointment
     * @return the boolean
     */
    boolean updateAppointment(Appointment appointment);

    /**
     * Delete appointment boolean.
     *
     * @param appointmentId the appointment id
     * @return the boolean
     */
    boolean deleteAppointment(Long appointmentId);

    /**
     * Gets appointment sorted by.
     *
     * @param sortOrder the sort order
     * @return the appointment sorted by
     */
    List<Appointment> getAppointmentSortedBy( SortCriteriaEnum sortOrder );

    /**
     * Gets appointment with person.
     *
     * @param personId the person id
     * @return the appointment with person
     */
    List<Appointment> getAppointmentWithPerson(long personId);
}
