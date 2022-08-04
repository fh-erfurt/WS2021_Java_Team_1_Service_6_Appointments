package de.fherfurt.appointment.resources;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * The class Base resource.
 * @creator helmboldt
 */
@Path("/api")
public class BaseResource {

    /**
     * Info string.
     *
     * @return the string " Hello from Base Resource
     */
    @GET
    public String info() {
        return "Hello from Base Resource";
    }

    /**
     * Gets persons resource.
     *
     * @return the persons resource
     */
    @Path("/person")
    public PersonResource getPersonsResource() {
        return new PersonResource();
    }

    /**
     * Gets addresses resources.
     *
     * @return the addresses resources
     */
    @Path("/appointment")
    public AppointmentResource getAddressesResources() {
        return new AppointmentResource();
    }
}
