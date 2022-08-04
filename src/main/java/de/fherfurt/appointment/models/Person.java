package de.fherfurt.appointment.models;

import de.fherfurt.appointment.storage.core.AbstractDatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person extends AbstractDatabaseEntity {

    private String firstName;

    private String lastName;

    private String email;

    //Eine Person kann viele Termine haben
    @ManyToMany(mappedBy = "persons")
    private List<Appointment> appointments;
}
