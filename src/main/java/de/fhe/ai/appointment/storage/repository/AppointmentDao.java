package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Appointment;

import java.util.Collection;

public interface AppointmentDao extends GenericDao<Appointment> {

    Collection<Appointment> findSortedBy();
}
