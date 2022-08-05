package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Person;

import java.util.List;

/**
 * The interface Person repository.The interface Person repository is abstraction to PersonDao to get all functions.
 */
public interface PersonRepository {

    /**
     * Gets all persons.
     *
     * @return  all persons
     */
    List<Person> getAllPersons();

    /**
     * Gets person.
     *
     * @param personId the person id
     * @return the person with person Id
     */
    Person getPerson(long personId );

    /**
     * Create person boolean.
     *
     * @param person the person
     * @return the boolean if person is created
     */
    boolean createPerson( Person person );

    /**
     * Update person boolean.
     *
     * @param person the person
     * @return the boolean if a person is updated
     */
    boolean updatePerson( Person person );

    /**
     * Delete person boolean.
     *
     * @param personId the person id
     * @return the boolean if a person with th person id is deleted
     */
    boolean deletePerson( long personId );
}
