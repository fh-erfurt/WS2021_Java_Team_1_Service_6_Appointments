package de.fherfurt.appointments.storage.core;

import java.util.Collection;
import java.util.List;

public interface IGenericDao<T extends AbstractDatabaseEntity> {
    T findById( Long id );
    Collection<T> findAll();

    void create( T entity );
    void createAll( Collection<T> newEntities );

    T update( T entity );

    void delete( Long id );
    void delete( T entity );
    void delete( List<T> entries );
}
