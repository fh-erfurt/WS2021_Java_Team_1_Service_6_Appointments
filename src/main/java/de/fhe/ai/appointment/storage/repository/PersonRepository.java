package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Person;

import java.util.List;

public interface PersonRepository {

    List<Person> getAllPersons();

    Person getPerson(long personId );
    boolean createPerson( Person person );
    boolean updatePerson( Person person );
    boolean deletePerson( long personId );

    List<Person> getPersonWithAppointment(long appointmentId);
}
