package de.fherfurt.appointments;

import de.fherfurt.appointments.client.AppointmentsClient;
import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;
import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;
import de.fherfurt.appointments.storage.core.DataController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

public class AppointmentsService implements AppointmentsClient {
    @Override
    public int createAppointment(String name, int creator, LocalDateTime date, String repetition, String campusLocation, String room, String description) {
        try{
            Repetition repEnum = Repetition.valueOf(repetition);
            Campus campusEnum = Campus.valueOf(campusLocation);
            Appointment appointment = new Appointment(name, creator, date, repEnum, campusEnum, room, description, new ArrayList<>());
            return appointment.getId();

            // ToDo: Appointment in DB persistieren
        }
        catch (IllegalArgumentException iae) {
            // Fehler posten
        }
        return -1;
    }

    @Override
    public void deleteAppointment(int id) {
        // ToDo: Appointment in DB löschen
    }

    @Override
    public void addParticipant(int appointmentId, int participantId) {
        // Instant Appoint laden mit find
        // Participant hinzufügen
        // JPA persistieren
        // ToDo: Teilnehmer in Appointment Datenbankeintrag hinzufügen
    }

    @Override
    public void removeParticipant(int appointmentId, int participantId) {
        // Instant Appoint laden mit find
        // Participant löschen
        // JPA persistieren
        // ToDo: Teilnehmer in Appointment Datenbankeintrag löschen
    }

    private Optional<Appointment> getAppointment (int id) {
        return Optional.empty();
    }

    @Override
    public Optional<NewsAppointment> getAppointmentById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<NewsAppointment> getAppointmentByName(String name) {
        return Optional.empty();
    }
}
