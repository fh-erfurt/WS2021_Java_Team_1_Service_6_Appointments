package de.fherfurt.appointment.resources;


import de.fherfurt.appointment.models.Appointment;
import de.fherfurt.appointment.models.SortCriteriaEnum;
import de.fherfurt.appointment.storage.repository.AppointmentRepository;
import de.fherfurt.appointment.storage.repository.RepositoryFactory;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

public class AppointmentResource {

    private final AppointmentRepository appointmentRepository;

    public AppointmentResource(){
        this.appointmentRepository = RepositoryFactory.getInstance().getAppointmentRepository();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAppointment(@QueryParam("sortOrder") @DefaultValue("UNDEFINED")SortCriteriaEnum sortOrder){
        if (sortOrder != SortCriteriaEnum.UNDEFINED){
            return this.appointmentRepository.getAppointmentSortedBy(sortOrder);
        }
        else{
            return this.appointmentRepository.getAllAppointments();
        }
    }

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
