package de.fherfurt.appointment.resources;


import de.fherfurt.appointment.models.Person;
import de.fherfurt.appointment.storage.repository.PersonRepository;
import de.fherfurt.appointment.storage.repository.RepositoryFactory;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

/**
 * class which handles person httprequests
 * link http://localhost:8080/api/person...
 *
 * @author helmboldt
 */
public class PersonResource {

    private final PersonRepository personRepository;


    public PersonResource() {
        this.personRepository = RepositoryFactory.getInstance().getPersonRepository();
    }

    /**
     * @return all existing person
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAppointment() {
        return this.personRepository.getAllPersons();
    }

    /**
     * returns person based on a given personId
     *
     * @param personId id of person
     * @return the person with the personID
     * ok if created else Status NOT_Found
     */
    @GET
    @Path("{personId:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPerson(@PathParam("personId") long personId) {
        Person p = this.personRepository.getPerson(personId);

        if (p != null) {
            return Response.ok(p).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
