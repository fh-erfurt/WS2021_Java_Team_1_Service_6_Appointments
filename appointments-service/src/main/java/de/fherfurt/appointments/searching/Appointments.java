package de.fherfurt.appointments.searching;

import de.fherfurt.appointments.client.AppointmentsClient;
import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;

import java.util.Optional;

public class Appointments implements AppointmentsClient {


    @Override
    public Optional<NewsAppointment> getAppointByName(String AppointmentName) {
        return Optional.empty();
    }

    @Override
    public Optional<NewsAppointment> getAppointmentById(int AppointmentId) {
        return Optional.empty();
    }
}
