package de.fhe.ai.appointment.resources;

import de.fhe.ai.appointment.model.Person;
import de.fhe.ai.appointment.storage.repository.PersonRepository;
import de.fhe.ai.appointment.storage.repository.RepositoryFactory;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

public class PersonResource {

    private final PersonRepository personRepository;

    public PersonResource(){
        this.personRepository = RepositoryFactory.getInstance().getPersonRepository();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAppointment(@QueryParam("appointmentId") @DefaultValue("-1") long appointmentId){
        if (appointmentId != -1){
            return this.personRepository.getPersonWithAppointment(appointmentId);
        }
        else {
            return this.personRepository.getAllPersons();
        }
    }

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
