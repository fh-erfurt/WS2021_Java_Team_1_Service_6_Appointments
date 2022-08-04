package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;

/**
 * The class Jpa appointment dao, which extends from  Appointment by JpaGenericDao.
 * it has package-local visibility - thus, instances can only be created inside this package. Using  this approach,
 * we can prevent any class from the outside of this package to create DAO instances.
 *
 * If you need a DAO, should use our DataController class.
 */
public class JPAAppointmentDao extends JpaGenericDao<Appointment> implements AppointmentDao{

    /**
     * Instantiates a new Jpa appointment dao.
     *
     * @param em the EntityManager
     * @creator huetter
     */
    public JPAAppointmentDao(EntityManager em) {
        super(Appointment.class, em);
    }

    @Override
    public Collection<Appointment> findWithPerson(Person person) {
        Query query = getEntityManager().createQuery(
                "SELECT e FROM " + getEntityClass().getCanonicalName() + " e where e.persons = ?1" );
        query.setParameter(1, person);

        return (Collection<Appointment>) query.getResultList();
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
