package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;

/**
 * The class Jpa person dao, which extends from  Person by JpaGenericDao.
 *
 *  * we can prevent any class from the outside of this package to create DAO instances.
 *  *
 *  * If you need a DAO, should use our DataController class.
 * @author teichmueller
 */
public class JPAPersonDao extends JpaGenericDao<Person> implements PersonDao  {


    public JPAPersonDao(EntityManager em){
        super(Person.class, em);
    }

}
