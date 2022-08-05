package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Appointment;
import de.fhe.ai.appointment.model.SortCriteriaEnum;

import java.util.List;

public interface AppointmentRepository {

    List<Appointment> getAllAppointments();

    Appointment getAppointment(Long appointmentId);
    boolean createAppointment(Appointment appointment);
    boolean updateAppointment(Appointment appointment);
    boolean deleteAppointment(Long appointmentId);

    List<Appointment> getAppointmentSortedBy( SortCriteriaEnum sortOrder );
}
