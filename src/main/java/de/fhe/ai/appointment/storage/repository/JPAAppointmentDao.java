package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Appointment;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;

public class JPAAppointmentDao extends JpaGenericDao<Appointment> implements AppointmentDao{

    public JPAAppointmentDao(EntityManager em) {
        super(Appointment.class, em);
    }

    @Override
    public Collection<Appointment> findSortedBy() {
        //TODO
        return null;
    }
}
