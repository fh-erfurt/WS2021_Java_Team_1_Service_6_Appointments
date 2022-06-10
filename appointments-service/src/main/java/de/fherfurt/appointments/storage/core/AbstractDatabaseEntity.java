package de.fherfurt.appointments.storage.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractDatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

    @PrePersist
    void onCreate()
    {
        this.setCreated( new Date() );
    }

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
                ", modified=" + modified +
                '}';
    }
}
