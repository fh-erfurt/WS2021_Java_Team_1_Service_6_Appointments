package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Appointment;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * implementation of previously defined methods
 */
public class JPAAppointmentDao extends JpaGenericDao<Appointment> implements AppointmentDao {

    public JPAAppointmentDao(EntityManager em) {
        super(Appointment.class, em);
    }

    @Override
    public Collection<Appointment> findWithPerson(long personId) {
        List<Appointment> app = (List<Appointment>) this.findAll();

        return app.stream()
                .filter(a -> a.hasPerson(personId))
                .collect(Collectors.toList());

    }

    @Override
    public Collection<Appointment> findSortedByNameAsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.asc(from.get("name")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Collection<Appointment> findSortedByNameDsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.desc(from.get("name")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Collection<Appointment> findSortedByDateAsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.asc(from.get("date")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Collection<Appointment> findSortedByDateDsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.desc(from.get("date")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Collection<Appointment> findSortedByCreatorAsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.asc(from.get("creator")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Collection<Appointment> findSortedByCreatorDsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.desc(from.get("creator")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Collection<Appointment> findSortedByCampusLocationAsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.asc(from.get("campusLocation")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Collection<Appointment> findSortedByCampusLocationDsc() {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<Appointment> criteriaQuery = criteriaBuilder.createQuery(Appointment.class);
        Root<Appointment> from = criteriaQuery.from(Appointment.class);
        criteriaQuery.select(from);
        criteriaQuery.orderBy(criteriaBuilder.desc(from.get("campusLocation")));

        return this.entityManager.createQuery(criteriaQuery).getResultList();
    }
}
