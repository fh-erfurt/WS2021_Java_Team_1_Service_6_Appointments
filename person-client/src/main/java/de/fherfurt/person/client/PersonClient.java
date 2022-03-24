package de.fherfurt.person.client;

import de.fherfurt.person.client.transfer.objects.AppointmentPerson;

import java.util.List;
import java.util.Optional;

/**
 * Interface of Person Client with given functionalities
 *
 * @author Jonas Helmboldt
 */
public interface PersonClient {
    Optional<AppointmentPerson> findByEmail(String email);
    List<AppointmentPerson> findByName(String name);
}
