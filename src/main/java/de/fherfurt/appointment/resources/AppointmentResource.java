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
 * class which handles appointment httprequests
 * link http://localhost:8080/api/appointment...
 *
 * @author helmboldt
 */
public class AppointmentResource {

    private final AppointmentRepository appointmentRepository;


    public AppointmentResource() {
        this.appointmentRepository = RepositoryFactory.getInstance().getAppointmentRepository();
    }

    /**
     * outputs appointments based on given criteria, else returns all appointments
     *
     * @param personId  person attending the appointment
     * @param sortOrder sort criteria {@link de.fherfurt.appointment.models.SortCriteriaEnum}
     * @return all appointments,
     * sorted appointment list,
     * appointment list based on person attending the appointment
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAppointment(
            @QueryParam("personId") @DefaultValue("-1") long personId,
            @QueryParam("sortOrder") @DefaultValue("UNDEFINED") SortCriteriaEnum sortOrder
    ) {
        if (personId != -1)
            return this.appointmentRepository.getAppointmentWithPerson(personId);
        else if (sortOrder != SortCriteriaEnum.UNDEFINED)
            return this.appointmentRepository.getAppointmentSortedBy(sortOrder);
        else
            return this.appointmentRepository.getAllAppointments();
    }

    /**
     * outputs appointments based on given id
     *
     * @param appointmentId appointment id
     * @return appointment
     */
    @GET
    @Path("{appointmentId:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAppointment(@PathParam("appointmentId") long appointmentId) {

        Appointment a = this.appointmentRepository.getAppointment(appointmentId);

        if (a != null) {
            return Response.ok(a).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * create appointment via POST request
     *
     * @param appointmentToCreate appointment which should be created
     * @return http response
     * ok if created else internal_server_error
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAppointment(Appointment appointmentToCreate) {
        boolean success = this.appointmentRepository.createAppointment(appointmentToCreate);

        if (success) {
            return Response.ok(appointmentToCreate).build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * update existing appointment via PUT request
     *
     * @param appointmentToUpdate appointment which should be updated
     * @return http response
     * ok if created else internal_server_error
     */
    @PUT
    @Path("{appointmentId:\\d+}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAppointment(Appointment appointmentToUpdate) {
        boolean success = this.appointmentRepository.updateAppointment(appointmentToUpdate);

        if (success) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * delete existing appointment via DELETE request
     *
     * @param appointmentId id of appointment which should be deleted
     * @return http response
     * ok if created else Status.NOT_FOUND
     */
    @DELETE
    @Path("{appointmentId:\\d+}")
    public Response deleteAppointment(@PathParam("appointmentId") long appointmentId) {

        Appointment a = this.appointmentRepository.getAppointment(appointmentId);

        if (a != null) {
            this.appointmentRepository.deleteAppointment(appointmentId);
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
