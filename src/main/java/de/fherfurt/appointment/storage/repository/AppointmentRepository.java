package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.SortCriteriaEnum;

import java.util.List;

public interface AppointmentRepository {

    List<Appointment> getAllAppointments();

    Appointment getAppointment(Long appointmentId);
    boolean createAppointment(Appointment appointment);
    boolean updateAppointment(Appointment appointment);
    boolean deleteAppointment(Long appointmentId);

    List<Appointment> getAppointmentSortedBy( SortCriteriaEnum sortOrder );
}
