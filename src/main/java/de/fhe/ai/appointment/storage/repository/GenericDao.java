package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.storage.core.AbstractDatabaseEntity;

import java.util.Collection;
import java.util.List;

interface GenericDao<T extends AbstractDatabaseEntity>{
    T findById( Long id );
    Collection<T> findAll();

    boolean create( T entity );
    boolean createAll( Collection<T> newEntities );

    T update( T entity );

    boolean delete( Long id );
    boolean delete( T entity );
    boolean delete( List<T> entries );
}
