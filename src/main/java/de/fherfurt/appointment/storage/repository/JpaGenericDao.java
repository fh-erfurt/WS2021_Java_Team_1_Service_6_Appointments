package de.fherfurt.appointment.storage.repository;


import de.fherfurt.appointment.storage.core.AbstractDatabaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

/**
 * The class Jpa generic dao extends from AbstractDatabaseEntity for all model objects.
 *
 *  * it has package-local visibility - thus, instances can only be created inside this package. Using  this approach,
 *  * we can prevent any class from the outside of this package to create DAO instances.
 *  *
 *  * If you need a DAO, should use our DataController class.
 *
 * @param <T> the type parameter
 */
class JpaGenericDao<T extends AbstractDatabaseEntity> implements GenericDao<T> {

    /**
     * The Persistent class.
     */
    protected final Class<T> persistentClass;
    /**
     * The Entity manager.
     */
    protected final EntityManager entityManager;

    /**
     * Instantiates a new Jpa generic dao.
     *
     * @param type the type
     * @param em   the em
     */
    public JpaGenericDao( Class<T> type, EntityManager em )
    {
        this.persistentClass = type;
        this.entityManager = em;
    }
    // findById( final Long id) alternative laut Referenz
    public T findById(Long id) {
        return getEntityManager().find( persistentClass, id );
    }

    public Collection<T> findAll()
    {
        Query query = getEntityManager().createQuery(
                "SELECT e FROM " + getEntityClass().getCanonicalName() + " e" );
        return (Collection<T>) query.getResultList();
    }

    public boolean create( T entity )
    {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist( entity );
        getEntityManager().getTransaction().commit();

        return true;
    }

    public boolean createAll( Collection<T> newEntities )
    {
        getEntityManager().getTransaction().begin();

        for( T entry : newEntities )
            getEntityManager().persist( entry );

        getEntityManager().getTransaction().commit();

        return true;
    }

    public T update( T entity )
    {
        getEntityManager().getTransaction().begin();
        final T savedEntity = getEntityManager().merge( entity );
        getEntityManager().getTransaction().commit();

        return savedEntity;
    }

    public boolean delete( Long id )
    {
        T entity = this.findById( id );
        return this.delete( entity );
    }

    public boolean delete( T entity )
    {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove( entity );
        getEntityManager().getTransaction().commit();

        return true;
    }

    public boolean delete( List<T> entries )
    {
        getEntityManager().getTransaction().begin();

        for( T entry : entries ) {
            getEntityManager().remove( entry );
        }

        getEntityManager().getTransaction().commit();

        return true;
    }

    /*
        Getter & Setter
     */

    /**
     * Gets entity class.
     *
     * @return the entity class
     */
    public Class<T> getEntityClass()
    {
        return persistentClass;
    }

    /**
     * Gets entity manager.
     *
     * @return the entity manager
     */
    public EntityManager getEntityManager()
    {
        return entityManager;
    }
}
