package de.fherfurt.appointment.storage.repository;

import de.fherfurt.appointment.storage.core.AbstractDatabaseEntity;

import java.util.Collection;
import java.util.List;

/**
 * The common interface for all of the  dao classes.
 *  Completely hides all the JPA/ Database related stuff.
 *  Always to use this interface as reference type  whereever you want to use a DAO.
 *
 * @param <T> the generic DAO parameter
 */
interface GenericDao<T extends AbstractDatabaseEntity>{
    /**
     * Find by id t.
     *
     * @param id the id
     * @return the  Generic t
     */
    T findById( Long id );

    /**
     * Find all collection.
     *
     * @return the collection
     */
    Collection<T> findAll();

    /**
     * Create boolean.
     *
     * @param entity the entity
     * @return the boolean
     */
    boolean create( T entity );

    /**
     * Create all boolean.
     *
     * @param newEntities the new entities
     * @return the boolean
     */
    boolean createAll( Collection<T> newEntities );

    /**
     * Update t.
     *
     * @param entity the entity
     * @return the   Generic t
     */
    T update( T entity );

    /**
     * Delete boolean.
     *
     * @param id the id
     * @return the boolean
     */
    boolean delete( Long id );

    /**
     * Delete boolean.
     *
     * @param entity the entity
     * @return the boolean
     */
    boolean delete( T entity );

    /**
     * Delete boolean.
     *
     * @param entries the entries
     * @return the boolean
     */
    boolean delete( List<T> entries );
}
