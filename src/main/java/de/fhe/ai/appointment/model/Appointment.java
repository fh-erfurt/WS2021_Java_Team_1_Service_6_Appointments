package de.fhe.ai.appointment.model;

import de.fhe.ai.appointment.storage.core.AbstractDatabaseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment extends AbstractDatabaseEntity {

    private String name;

    private String creator; // change Type into String

    private LocalDateTime date;// new LocalDateTime()

    private String repetition;

    private String campusLocation;

    private String room;

    private String description;


    @ManyToMany
    private List<Person> persons;

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
