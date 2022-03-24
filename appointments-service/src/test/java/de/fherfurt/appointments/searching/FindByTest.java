package de.fherfurt.appointments.searching;

import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;
import de.fherfurt.appointments.models.Creator;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jonas Helmboldt
 */
class FindByTest {

    @Test
    void findById() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment(1, "Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment);
        FindBy testFilter = new FindBy(testAppointmentList);
        int testId = 1;

        //when
        testFilter.FindById(testId);

        //then
        assertEquals(testFilter.FindById(testId), testAppointment);
    }

    @Test
    void findByName() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment("Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment);
        FindBy testFilter = new FindBy(testAppointmentList);
        String testName = "Test";

        //when
        testFilter.FindByName(testName);

        //then
        assertEquals(testFilter.FindByName(testName), List.of(testAppointment));

    }

    @Test
    void findByDate() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment("Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment);
        FindBy testFilter = new FindBy(testAppointmentList);


        //when
        testFilter.FindByDate(testDate);

        //then
        assertEquals(testFilter.FindByDate(testDate), List.of(testAppointment));
    }

    @Test
    void findByCreator() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment("Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment);
        FindBy testFilter = new FindBy(testAppointmentList);

        //when
        testFilter.FindByCreator(testCreator);

        //then
        assertEquals(testFilter.FindByCreator(testCreator), List.of(testAppointment));
    }

    @Test
    void findByCampus() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment("Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment);
        FindBy testFilter = new FindBy(testAppointmentList);


        //when
        testFilter.FindByCampus(Campus.ALTONAERCAMPUS);

        //then
        assertEquals(testFilter.FindByCampus(Campus.ALTONAERCAMPUS), List.of(testAppointment));
    }
}