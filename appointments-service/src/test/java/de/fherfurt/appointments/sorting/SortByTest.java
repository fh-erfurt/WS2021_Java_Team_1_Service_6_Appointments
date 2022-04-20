package de.fherfurt.appointments.sorting;

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
class SortByTest {

    /**
     * sort the appointments by the date
     */

    @Test
    void sortByDate() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        LocalDateTime testDate2 = LocalDateTime.of(1,1,1,1,1);
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment1 = new Appointment("Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        Appointment testAppointment2 = new Appointment("Test", testCreator , testDate2, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment1);
        testAppointmentList.add(testAppointment2);
        SortBy testSort = new SortBy(testAppointmentList);

        //when
        testSort.SortByDate();

        //then
        assertEquals(testSort.SortByDate(), List.of(testAppointment2, testAppointment1));
    }

    /**
     * sort the appointments by the creators name
     */

    @Test
    void sortByCreatorName() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        LocalDateTime testDate2 = LocalDateTime.of(1,1,1,1,1);
        Creator testCreator = new Creator("Mustermann", "1234245");
        Creator testCreator2 = new Creator("Albermann", "1234245");
        Appointment testAppointment1 = new Appointment("Test", testCreator , testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        Appointment testAppointment2 = new Appointment("Test", testCreator2 , testDate2, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment1);
        testAppointmentList.add(testAppointment2);
        SortBy testSort = new SortBy(testAppointmentList);

        //when
        testSort.SortByCreatorName();

        //then
        assertEquals(testSort.SortByCreatorName(), List.of(testAppointment2, testAppointment1));
    }
    /**
     * sort the appointments by the location
     */
    @Test
    void sortByCampus() {
        //given
        List<Appointment> testAppointmentList = new ArrayList<>();
        LocalDateTime testDate = LocalDateTime.now();
        LocalDateTime testDate2 = LocalDateTime.of(1,1,1,1,1);
        Creator testCreator = new Creator("Mustermann", "1234245");
        Creator testCreator2 = new Creator("Albermann", "1234245");
        Appointment testAppointment1 = new Appointment("Test", testCreator , testDate, Repetition.DAILY, Campus.SCHLUETERCAMPUS, "TestRoom", "TestDescription");
        Appointment testAppointment2 = new Appointment("Test", testCreator2 , testDate2, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        testAppointmentList.add(testAppointment1);
        testAppointmentList.add(testAppointment2);
        SortBy testSort = new SortBy(testAppointmentList);

        //when
        testSort.SortByCampus();

        //then
        assertEquals(testSort.SortByCampus(), List.of(testAppointment2, testAppointment1));
    }
}