package de.fhe.ai.appointment.storage.repository;

import de.fhe.ai.appointment.model.Appointment;
import de.fhe.ai.appointment.model.Person;
import de.fhe.ai.appointment.model.SortCriteriaEnum;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements PersonRepository, AppointmentRepository{

    private final AppointmentDao appointmentDao;
    private final PersonDao personDao;

    RepositoryImpl(PersonDao personDao, AppointmentDao appointmentDao){
        this.personDao = personDao;
        this.appointmentDao = appointmentDao;
    }

    @Override
    public List<Appointment> getAllAppointments() {
       return new ArrayList<>(this.appointmentDao.findAll());
    }

    @Override
    public Appointment getAppointment(Long appointmentId) {
        return this.appointmentDao.findById(appointmentId);
    }

    @Override
    public boolean createAppointment(Appointment appointment) {
        return this.appointmentDao.create(appointment);
    }

    @Override
    public boolean updateAppointment(Appointment appointment) {
        return this.appointmentDao.update(appointment) == appointment;
    }

    @Override
    public boolean deleteAppointment(Long appointmentId) {
        return this.appointmentDao.delete(appointmentId);
    }

    @Override
    public List<Appointment> getAppointmentSortedBy(SortCriteriaEnum sortOrder) {
        //TODO
        return null;
    }

    @Override
    public List<Person> getAllPersons() {
        return new ArrayList<>(this.personDao.findAll());
    }

    @Override
    public Person getPerson(long personId) {
        return this.personDao.findById(personId);
    }

    @Override
    public boolean createPerson(Person person) {
        return this.personDao.create(person);
    }

    @Override
    public boolean updatePerson(Person person) {
        return this.personDao.update(person) == person;
    }

    @Override
    public boolean deletePerson(long personId) {
        return this.personDao.delete(personId);
    }

    @Override
    public List<Person> getPersonWithAppointment(long appointmentId) {
        Appointment appointment = this.getAppointment(appointmentId);

        if (appointment == null){
            return new ArrayList<>();
        }
        return new ArrayList<>(this.personDao.findWithAppointment(appointment));
    }
}
