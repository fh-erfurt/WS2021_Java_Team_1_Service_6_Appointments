package de.fherfurt.appointment.models;

import de.fherfurt.appointment.storage.core.AbstractDatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * The class Appointment extends from AbstractDatabaseEntity.
 * @author  teichmueller
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment extends AbstractDatabaseEntity {

    private String name;

    private String creator;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String repetition;

    private String campusLocation;

    private String room;

    private String description;


    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Person> persons;

    /**
     * The method show true if the person is in the personList
     * @param personId
     * @return true if found
     *         else false
     *
     */

    public boolean hasPerson (long personId) {
        for( Person p : this.getPersons() ) {
            if( p.getId() == personId ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(name, that.name) && Objects.equals(creator, that.creator) && Objects.equals(date, that.date) && Objects.equals(repetition, that.repetition) && Objects.equals(campusLocation, that.campusLocation) && Objects.equals(room, that.room) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creator, date, repetition, campusLocation, room, description);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", creator='" + creator + '\'' +
                ", date=" + date +
                ", repetition='" + repetition + '\'' +
                ", campusLocation='" + campusLocation + '\'' +
                ", room='" + room + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
