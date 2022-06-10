package de.fherfurt.appointments.searching;

import de.fherfurt.appointments.client.AppointmentsClient;
import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;
import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.mapper.AppointmentMapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * Class that implements the functionality of the appointments-client
 *
 * @author Jonas Helmboldt
 */
public class AppointmentInterfaceFunctions implements AppointmentsClient {

    List<Appointment> appointmentList;

    public AppointmentInterfaceFunctions(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }


    @Override
    public Optional<NewsAppointment> getAppointmentById(int id) {
        FindBy find = new FindBy(appointmentList);
        Appointment searchResult = find.FindById(id);
        if (searchResult != null){
            NewsAppointment newsAppointment;
            AppointmentMapper mapper = new AppointmentMapper();
            newsAppointment = mapper.NewsAppointmentMapper(searchResult);
            return Optional.ofNullable(newsAppointment);
        }
        return Optional.empty();
    }

    @Override
    public Optional<NewsAppointment> getAppointmentByName(String name) {
        FindBy find = new FindBy(appointmentList);
        List<Appointment> searchResult = find.FindByName(name);
        if (!searchResult.isEmpty()) {
            AppointmentMapper mapper = new AppointmentMapper();
            NewsAppointment newsAppointment = mapper.NewsAppointmentMapper(searchResult.get(0));
            return Optional.ofNullable(newsAppointment);
        }
        return Optional.empty();
    }
}
