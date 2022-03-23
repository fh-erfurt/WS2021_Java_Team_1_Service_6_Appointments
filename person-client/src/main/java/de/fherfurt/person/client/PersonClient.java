package de.fherfurt.person.client;

import de.fherfurt.person.client.transfer.objects.AppointmentPerson;

import java.util.List;
import java.util.Optional;

public interface PersonClient {
    Optional<AppointmentPerson> findById(int id);
    Optional<AppointmentPerson> findByEmail(String email);
    List<AppointmentPerson> findByName(String name);
}
