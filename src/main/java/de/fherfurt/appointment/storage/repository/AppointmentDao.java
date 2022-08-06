package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.models.Appointment;

import java.util.Collection;

public interface AppointmentDao extends GenericDao<Appointment> {

    /**
     * the method "findWithPerson" will find all appointments with an attending person based on a personId
     *
     * @param personId the person
     * @return the collection of appointments
     */
    Collection<Appointment> findWithPerson(long personId);

    /**
     * the method "findSortedByNameAsc" will return a sorted appointment collection by name ascending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByNameAsc();

    /**
     * the method "findSortedByNameDsc" will return a sorted appointment collection by name descending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByNameDsc();

    /**
     * the method "findSortedByDateAsc" will return a sorted appointment collection by date ascending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByDateAsc();

    /**
     * the method "findSortedByDateDsc" will return a sorted appointment collection by date descending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByDateDsc();

    /**
     * the method "findSortedCreatorAsc" will return a sorted appointment collection by creator ascending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByCreatorAsc();

    /**
     * the method "findSortedCreatorDsc" will return a sorted appointment collection by creator descending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByCreatorDsc();

    /**
     * the method "findSortedLocationAsc" will return a sorted appointment collection by location ascending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByCampusLocationAsc();

    /**
     * the method "findSortedLocationDsc" will return a sorted appointment collection by location descending
     *
     * @return sorted appointment collection
     */
    Collection<Appointment> findSortedByCampusLocationDsc();

}
