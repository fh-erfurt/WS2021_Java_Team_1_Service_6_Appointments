package de.fhe.ai.appointment.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class BaseResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String info(){
        return "Hello from Base Resource";
    }

    @Path("/appointment")
    public AppointmentResource getAppointmentResource(){
        return new AppointmentResource();
    }

    @Path("/person")
    public PersonResource getPersonResource(){
        return new PersonResource();
    }
}
