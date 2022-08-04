package de.fherfurt.appointment.resources;


import de.fherfurt.appointment.models.Person;
import de.fherfurt.appointment.storage.repository.PersonRepository;
import de.fherfurt.appointment.storage.repository.RepositoryFactory;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

/**
 * The class Person resource.
 * @creator jadranski
 */
public class PersonResource {

    private final PersonRepository personRepository;

    /**
     * Instantiates a new Person resource.
     */
    public PersonResource(){
        this.personRepository = RepositoryFactory.getInstance().getPersonRepository();
    }

    /**
     * Gets appointment.
     *
     * @param appointmentId the appointment id
     * @return the appointment
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAppointment(@QueryParam("appointmentId") @DefaultValue("-1") long appointmentId){
            return this.personRepository.getAllPersons();
    }

    /**
     * Gets person.
     *
     * @param personId the person id
     * @return the person
     */
    @GET
    @Path("{personId:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPerson(@PathParam("personId") long personId){
        Person p = this.personRepository.getPerson(personId);

        if (p != null){
            return Response.ok(p).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
