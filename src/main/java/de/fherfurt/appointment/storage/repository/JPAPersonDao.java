package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Person;

import javax.persistence.EntityManager;

/**
 * currently not fully used
 */
public class JPAPersonDao extends JpaGenericDao<Person> implements PersonDao {

    public JPAPersonDao(EntityManager em) {
        super(Person.class, em);
    }
}
