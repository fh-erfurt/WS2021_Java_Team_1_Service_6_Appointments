package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.Person;

import java.util.Collection;

/**
 * The interface Appointment dao.
 */
public interface AppointmentDao extends GenericDao<Appointment> {

    /**
     * Find with person collection.
     *
     * @param person the person
     * @return the collection
     */
    Collection<Appointment> findWithPerson(Person person);

    /**
     * Find sorted by name asc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByNameAsc();

    /**
     * Find sorted by name dsc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByNameDsc();

    /**
     * Find sorted by date asc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByDateAsc();

    /**
     * Find sorted by date dsc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByDateDsc();

    /**
     * Find sorted by creator asc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByCreatorAsc();

    /**
     * Find sorted by creator dsc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByCreatorDsc();

    /**
     * Find sorted by campus location asc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByCampusLocationAsc();

    /**
     * Find sorted by campus location dsc collection.
     *
     * @return the collection
     */
    Collection<Appointment> findSortedByCampusLocationDsc();

}