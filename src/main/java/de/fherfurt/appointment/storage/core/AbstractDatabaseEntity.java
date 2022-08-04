package de.fherfurt.appointment.storage.core;

import javax.persistence.*;
import java.util.Date;

/**
 * The class Abstract database entity.
 * @creator helmboldt
 */

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class AbstractDatabaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Version
    private Long version;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

    /**
     * Instantiates a new Abstract database entity.
     */
    public AbstractDatabaseEntity() {}

    /**
     * Gets created.
     *
     * @return the created
     */
    public Date getCreated()
    {
        return created;
    }

    /**
     * Sets created.
     *
     * @param created the created
     */
    public void setCreated(Date created)
    {
        this.created = created;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * Gets modified.
     *
     * @return the modified
     */
    public Date getModified()
    {
        return modified;
    }

    /**
     * Sets modified.
     *
     * @param modified the modified
     */
    public void setModified(Date modified)
    {
        this.modified = modified;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public Long getVersion()
    {
        return version;
    }

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(Long version)
    {
        this.version = version;
    }


    /*
        JPA Helper Methods
     */

    /**
     *  the method On create.
     */
    @PrePersist
    void onCreate()
    {
        this.setCreated( new Date() );
    }

    /**
     *  the method On update.
     */
    @PreUpdate
    void onUpdate()
    {
        this.setModified( new Date() );
    }

    @Override
    public String toString() {
        return "AbstractDatabaseEntity{" +
                "id=" + id +
                ", created=" + created +
                ", version=" + version +
                ", modified=" + modified +
                '}';
    }
}
