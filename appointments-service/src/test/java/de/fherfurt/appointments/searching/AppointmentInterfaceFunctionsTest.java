package de.fherfurt.appointments.searching;

import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;
import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;
import de.fherfurt.appointments.models.Creator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author Jonas Helmboldt
 */
class AppointmentInterfaceFunctionsTest {

    @Test
    void getAppointmentById() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment(1, "Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment);
        AppointmentInterfaceFunctions testInterfaceFunctions = new AppointmentInterfaceFunctions(testAppointmentList);
        //when
        Optional<NewsAppointment> result = testInterfaceFunctions.getAppointmentById(0);
        //then
        Assertions.assertEquals(Optional.empty(), result);

    }

    @Test
    void getAppointmentByName() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment(1, "Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment);
        AppointmentInterfaceFunctions testInterfaceFunctions = new AppointmentInterfaceFunctions(testAppointmentList);

        //when
        Optional<NewsAppointment> result = testInterfaceFunctions.getAppointmentByName("Falsch");
        //then
        Assertions.assertEquals(Optional.empty(), result);
    }
}