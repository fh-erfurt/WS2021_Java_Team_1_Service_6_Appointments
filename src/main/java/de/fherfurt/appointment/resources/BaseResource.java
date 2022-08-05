package de.fherfurt.appointment.resources;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * The class Base resource present httprequests and redirect to the other special Resources
 * @author helmboldt
 */
@Path("/api")
public class BaseResource {

    /**
     * Info string from the baseResource.
     *
     * @return string " Hello from Base Resource"
     */
    @GET
    public String info() {
        return "Hello from Base Resource";
    }

    /**
     * Gets persons resource.
     *
     * @return  new persons resource
     */
    @Path("/person")
    public PersonResource getPersonsResource() {
        return new PersonResource();
    }

    /**
     * Gets addresses resources.
     *
     * @return a new addresses resources
     */
    @Path("/appointment")
    public AppointmentResource getAddressesResources() {
        return new AppointmentResource();
    }
}
