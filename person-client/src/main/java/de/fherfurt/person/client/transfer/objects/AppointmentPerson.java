package de.fherfurt.person.client.transfer.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * relevant person information for the appointment service
 * TODO replace with the current models to use the {@link AppointmentPerson} instead
 *
 * @author Jonas Helmboldt
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AppointmentPerson {
    private String name;
    private String mail;
}
