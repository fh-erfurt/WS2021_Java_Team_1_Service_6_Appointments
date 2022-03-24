package de.fherfurt.appointments.mapper;

import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;
import de.fherfurt.appointments.main.Appointment;

public class AppointmentMapper {

    /**
     * Mapper that converts a {@link Appointment} to {@link NewsAppointment}
     *
     * @param inputAppointment {@link Appointment} which should be converted
     * @return finished {@link NewsAppointment}
     * @author Jonas Helmboldt
     */
    public NewsAppointment NewsAppointmentMapper (Appointment inputAppointment){

        NewsAppointment newsAppointmentDto = new NewsAppointment();
        newsAppointmentDto.setId(inputAppointment.getId());
        newsAppointmentDto.setName(inputAppointment.getName());
        newsAppointmentDto.setDate(inputAppointment.getDate());
        newsAppointmentDto.setPlace(inputAppointment.getCampusLocation() + " " + inputAppointment.getRoom());

        return newsAppointmentDto;
    }
}
