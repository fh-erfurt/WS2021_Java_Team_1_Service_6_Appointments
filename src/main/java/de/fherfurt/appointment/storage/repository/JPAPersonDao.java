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

    @Override
    public Collection<Person> findWithAppointment(Appointment appointment){
        Query query = getEntityManager().createQuery(
                "SELECT e FROM " + getEntityClass().getCanonicalName() + " e where e.appointment = ?1" );
        query.setParameter(1, appointment);

        return (Collection<Person>) query.getResultList();
    }
}
