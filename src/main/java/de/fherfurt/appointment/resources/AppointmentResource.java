package de.fherfurt.appointment.resources;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.SortCriteriaEnum;
import de.fherfurt.appointment.storage.repository.AppointmentRepository;
import de.fherfurt.appointment.storage.repository.RepositoryFactory;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

/**
 * The class Appointment resource.
 * @creator jadranski
 */
public class AppointmentResource {

    private final AppointmentRepository appointmentRepository;

    /**
     * Instantiates a new Appointment resource.
     */
    public AppointmentResource(){
        this.appointmentRepository = RepositoryFactory.getInstance().getAppointmentRepository();
    }

    /**
     * Gets appointment.
     *
     * @param personId  the person id
     * @param sortOrder the sort order
     * @return the appointment, a variable
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAppointment(
            @QueryParam( "personId" ) @DefaultValue( "-1" ) long personId,
            @QueryParam( "sortOrder" ) @DefaultValue( "UNDEFINED" ) SortCriteriaEnum sortOrder
    ) {
        if( personId != -1 )
            return this.appointmentRepository.getAppointmentWithPerson( personId );
        else if ( sortOrder != SortCriteriaEnum.UNDEFINED )
            return this.appointmentRepository.getAppointmentSortedBy( sortOrder );
        else
            return this.appointmentRepository.getAllAppointments();
    }

    /**
     * Gets appointment.
     *
     * @param appointmentId the appointment id
     * @return the appointment
     */
    @GET
    @Path("{appointmentId:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAppointment (@PathParam("appointmentId") long appointmentId){

        Appointment a = this.appointmentRepository.getAppointment(appointmentId);

        if (a != null){
            return Response.ok(a).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * Create appointment response.
     * // to create a Appointment
     *
     * @param appointmentToCreate the appointment to create
     * @return the response
     * @creator teichmueller
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAppointment(Appointment appointmentToCreate){
        boolean success = this.appointmentRepository.createAppointment(appointmentToCreate);

        if (success){
            return Response.ok(appointmentToCreate).build();
        }
        else{
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * Update appointment response.
     * // to create a Appointment
     * @param appointmentToUpdate the appointment to update
     * @return the response
     * @creator helmboldt
     */
    @PUT
    @Path("{appointmentId:\\d+}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAppointment(Appointment appointmentToUpdate){
        boolean success = this.appointmentRepository.updateAppointment(appointmentToUpdate);

        if (success){
            return Response.ok().build();
        }
        else{
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * Delete appointment response.
     * // to delete a Appointment
     * @param appointmentId the appointment id
     * @return the response
     * @creator helmboldt
     */
    @DELETE
    @Path("{appointmentId:\\d+}")
    public Response deleteAppointment(@PathParam("appointmentId") long appointmentId){

        Appointment a = this.appointmentRepository.getAppointment(appointmentId);

        if (a != null){
            this.appointmentRepository.deleteAppointment(appointmentId);
            return Response.ok().build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}