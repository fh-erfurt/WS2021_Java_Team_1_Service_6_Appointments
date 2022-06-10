package de.fherfurt.person.client;

import de.fherfurt.person.client.transfer.objects.AppointmentPerson;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Dev implementation of the Person Client
 *
 * @author Jonas Helmboldt
 */
public class DevPersonClient implements PersonClient {

    private final List<AppointmentPerson> persons = Arrays.asList(
            new AppointmentPerson(1,"Heinrich", "testmail@mail.com"),
            new AppointmentPerson(2, "Albert", "mail@mail.com"),
            new AppointmentPerson(3, "Manhans", "manhans@mail.com")
    );

    @Override
    public Optional<AppointmentPerson> findByEmail(String email) {
        return persons.stream().filter(AppointmentPerson -> Objects.equals(AppointmentPerson.getMail(), email)).findFirst();
    }

    @Override
    public List<AppointmentPerson> findByName(String name) {
        return persons.stream()
                .filter(persons -> persons.getName().equals(name))
                .collect(Collectors.toList());
    }

}
