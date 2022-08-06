package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.SortCriteriaEnum;

import java.util.List;

/**
 * repository to storage appointment objects
 *
 * @author teichmueller
 */
public interface AppointmentRepository {

    List<Appointment> getAllAppointments();

    /**
     * gets appointment based on given appointmentId
     *
     * @param appointmentId id of appointment object
     * @return one appointment with the given appointmentId
     */
    Appointment getAppointment(Long appointmentId);

    /**
     * create appointment
     *
     * @param appointment given appointment
     * @return true if successful
     */
    boolean createAppointment(Appointment appointment);

    /**
     * update appointment
     *
     * @param appointment given appointment
     * @return true if successful
     */
    boolean updateAppointment(Appointment appointment);

    /**
     * delete appointment
     *
     * @param appointmentId given appointmentId
     * @return true if successful
     */
    boolean deleteAppointment(Long appointmentId);

    /**
     * gets appointment list sorted by given criteria.
     *
     * @param sortOrder sort criteria based on {@link de.fherfurt.appointment.models.SortCriteriaEnum}
     * @return sorted appointment list
     */
    List<Appointment> getAppointmentSortedBy(SortCriteriaEnum sortOrder);

    /**
     * get appointment list with attending person
     *
     * @param personId id of person attending the appointment
     * @return filtered appointment list
     */
    List<Appointment> getAppointmentWithPerson(long personId);
}
