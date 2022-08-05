package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Appointment;

import java.util.Collection;

public interface AppointmentDao extends GenericDao<Appointment> {

    Collection<Appointment> findSortedByNameAsc();

    Collection<Appointment> findSortedByNameDsc();

    Collection<Appointment> findSortedByDateAsc();

    Collection<Appointment> findSortedByDateDsc();

    Collection<Appointment> findSortedByCreatorAsc();

    Collection<Appointment> findSortedByCreatorDsc();

    Collection<Appointment> findSortedByCampusLocationAsc();

    Collection<Appointment> findSortedByCampusLocationDsc();

}
