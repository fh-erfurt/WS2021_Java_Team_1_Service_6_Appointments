package de.fhe.ai.appointment.model;

import de.fhe.ai.appointment.storage.core.AbstractDatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


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
    @OneToMany
    private Appointment appointment;
}
