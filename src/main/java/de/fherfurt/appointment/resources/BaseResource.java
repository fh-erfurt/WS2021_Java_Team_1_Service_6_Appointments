package de.fherfurt.appointment.resources;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * handles basic httprequest and forwards them to special resources {@see AppointmentResource, PersonResource}
 *
 * @author jadranski
 */
@Path("/api")
public class BaseResource {

    /**
     * info string from the baseResource
     *
     * @return string " Hello from Base Resource"
     */
    @GET
    public String info() {
        return "Hello from Base Resource";
    }

    /**
     * gets persons resource
     *
     * @return new persons resource
     */
    @Path("/person")
    public PersonResource getPersonsResource() {
        return new PersonResource();
    }

    /**
     * gets addresses resources
     *
     * @return a new addresses resources
     */
    @Path("/appointment")
    public AppointmentResource getAddressesResources() {
        return new AppointmentResource();
    }
}
