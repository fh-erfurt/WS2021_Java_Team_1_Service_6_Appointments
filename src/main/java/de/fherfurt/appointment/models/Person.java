package de.fherfurt.appointment.models;

import de.fherfurt.appointment.storage.core.AbstractDatabaseEntity;
import lombok.*;

import javax.persistence.Entity;
import java.util.Objects;


/**
 * The class Person etends from AbstractDatabaseEntity.
 * @creator: teichmueller
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person extends AbstractDatabaseEntity {

    private String firstName;

    private String lastName;

    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }
}
