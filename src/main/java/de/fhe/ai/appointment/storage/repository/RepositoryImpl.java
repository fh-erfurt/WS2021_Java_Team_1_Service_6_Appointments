package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Appointment;
import de.fhe.ai.appointment.model.Person;
import de.fhe.ai.appointment.model.SortCriteriaEnum;

import java.util.List;

public class RepositoryImpl implements PersonRepository, AppointmentRepository{
    //TODO
    @Override
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @Override
    public Appointment getAppointment(Long appointmentId) {
        return null;
    }

    @Override
    public boolean createAppointment(Appointment appointment) {
        return false;
    }

    @Override
    public boolean updateAppointment(Appointment appointment) {
        return false;
    }

    @Override
    public boolean deleteAppointment(Long appointmentId) {
        return false;
    }

    @Override
    public List<Appointment> getAppointmentSortedBy(SortCriteriaEnum sortOrder) {
        return null;
    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }

    @Override
    public Person getPerson(long personId) {
        return null;
    }

    @Override
    public boolean createPerson(Person person) {
        return false;
    }

    @Override
    public boolean updatePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(long personId) {
        return false;
    }

    @Override
    public List<Person> getPersonWithAppointment(long appointmentId) {
        return null;
    }
}
