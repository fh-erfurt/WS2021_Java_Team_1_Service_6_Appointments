package de.fherfurt.appointments.client;

import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;

import java.util.Optional;


public interface AppointmentsClient {
    public Optional<NewsAppointment> getAppointByName(String AppointmentName);
    public Optional<NewsAppointment> getAppointmentById(int AppointmentId);
}
