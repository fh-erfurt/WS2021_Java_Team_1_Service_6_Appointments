package de.fherfurt.appointment.models;

import de.fherfurt.appointment.storage.core.AbstractDatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;


/**
 * The class Person extends from AbstractDatabaseEntity.
 * @author teichmueller
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

}
