package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Appointment;
import de.fhe.ai.appointment.model.Person;

import java.util.Collection;

public interface PersonDao extends GenericDao<Person>{
    Collection<Person> findWithAppointment(Appointment appointment);
}
