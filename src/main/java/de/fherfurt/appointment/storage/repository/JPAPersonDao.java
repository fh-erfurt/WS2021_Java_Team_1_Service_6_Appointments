package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;

public class JPAPersonDao extends JpaGenericDao<Person> implements PersonDao  {

    public JPAPersonDao(EntityManager em){
        super(Person.class, em);
    }

}
