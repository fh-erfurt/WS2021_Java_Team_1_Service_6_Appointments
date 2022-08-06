package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Person;

import java.util.List;

/**
 * repository to storage person objects
 *
 * @author teichmueller
 */
public interface PersonRepository {

    List<Person> getAllPersons();

    /**
     * gets person based on given personId
     *
     * @param personId id of person object
     * @return one person with the given personId
     */
    Person getPerson(long personId);

    /**
     * create person (currently not used)
     *
     * @param person given person
     * @return true if successful
     */
    boolean createPerson(Person person);

    /**
     * update person (currently not used)
     *
     * @param person given person
     * @return true if successful
     */
    boolean updatePerson(Person person);

    /**
     * delete person (currently not used)
     *
     * @param personId given personId
     * @return true if successful
     */
    boolean deletePerson(long personId);
}
