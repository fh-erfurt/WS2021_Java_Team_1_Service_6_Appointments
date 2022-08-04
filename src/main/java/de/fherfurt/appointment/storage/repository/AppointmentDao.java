package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;

import java.util.Collection;

public interface AppointmentDao extends GenericDao<Appointment> {

    Collection<Appointment> findWithPerson(Person person);

    Collection<Appointment> findSortedByNameAsc();

    Collection<Appointment> findSortedByNameDsc();

    Collection<Appointment> findSortedByDateAsc();

    Collection<Appointment> findSortedByDateDsc();

    Collection<Appointment> findSortedByCreatorAsc();

    Collection<Appointment> findSortedByCreatorDsc();

    Collection<Appointment> findSortedByCampusLocationAsc();

    Collection<Appointment> findSortedByCampusLocationDsc();

}
