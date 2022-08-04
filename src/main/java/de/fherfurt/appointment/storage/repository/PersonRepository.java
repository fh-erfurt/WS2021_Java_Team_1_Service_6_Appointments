package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Person;

import java.util.List;

/**
 * The interface Person repository.
 */
public interface PersonRepository {

    /**
     * Gets all persons.
     *
     * @return the all persons
     */
    List<Person> getAllPersons();

    /**
     * Gets person.
     *
     * @param personId the person id
     * @return the person
     */
    Person getPerson(long personId );

    /**
     * Create person boolean.
     *
     * @param person the person
     * @return the boolean
     */
    boolean createPerson( Person person );

    /**
     * Update person boolean.
     *
     * @param person the person
     * @return the boolean
     */
    boolean updatePerson( Person person );

    /**
     * Delete person boolean.
     *
     * @param personId the person id
     * @return the boolean
     */
    boolean deletePerson( long personId );
}
