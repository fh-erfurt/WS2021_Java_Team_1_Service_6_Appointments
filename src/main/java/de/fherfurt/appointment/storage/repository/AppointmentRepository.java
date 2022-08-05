package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;
import de.fherfurt.appointment.models.SortCriteriaEnum;

import java.util.List;

/**
 * The interface Appointment repository is abstarction to AppointmentDao to get all functions.
 * @author teichmueller
 */
public interface AppointmentRepository {

    /**
     * Gets all appointments.
     *
     * @return all appointments
     */
    List<Appointment> getAllAppointments();

    /**
     * Gets appointment.
     *
     * @param appointmentId the appointment id
     * @return one appointment with the appointmentId
     */
    Appointment getAppointment(Long appointmentId);

    /**
     * Create appointment boolean.
     *
     * @param appointment the appointment
     * @return the boolean if the creation of appointment is done
     */
    boolean createAppointment(Appointment appointment);

    /**
     * Update appointment boolean.
     *
     * @param appointment the appointment
     * @return the boolean if the Appointment was updated
     */
    boolean updateAppointment(Appointment appointment);

    /**
     * Delete appointment boolean.
     *
     * @param appointmentId the appointment id
     * @return the boolean if the Appointment was deleted
     */
    boolean deleteAppointment(Long appointmentId);

    /**
     * Gets appointment sorted by.
     *
     * @param sortOrder the sort order
     * @return appointment sorted by
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
