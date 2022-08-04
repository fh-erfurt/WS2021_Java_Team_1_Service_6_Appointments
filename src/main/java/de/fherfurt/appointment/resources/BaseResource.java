package de.fherfurt.appointment.resources;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api")
public class BaseResource {

    @GET
    public String info() {
        return "Hello from Base Resource";
    }

    @Path("/person")
    public PersonResource getPersonsResource() {
        return new PersonResource();
    }

    @Path("/appointment")
    public AppointmentResource getAddressesResources() {
        return new AppointmentResource();
    }
}
