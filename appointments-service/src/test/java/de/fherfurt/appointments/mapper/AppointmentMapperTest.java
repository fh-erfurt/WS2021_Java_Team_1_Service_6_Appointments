package de.fherfurt.appointments.mapper;

import de.fherfurt.appointments.client.transfer.objects.NewsAppointment;
import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;
import de.fherfurt.appointments.models.Creator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


/**
 * @author Jonas Helmboldt
 */
class AppointmentMapperTest {

    @Test
    void newsAppointmentMapper() {
        //given
        LocalDateTime testDate = LocalDateTime.now();
        Creator testCreator = new Creator("Mustermann", "1234245");
        Appointment testAppointment = new Appointment("Test", testCreator, testDate, Repetition.DAILY, Campus.ALTONAERCAMPUS, "TestRoom", "TestDescription");
        AppointmentMapper testMapper = new AppointmentMapper();

        //when
        NewsAppointment testNewsAppointment = testMapper.NewsAppointmentMapper(testAppointment);

        //then
        Assertions.assertEquals(testNewsAppointment.getName(), testAppointment.getName());
        Assertions.assertEquals(testNewsAppointment.getDate(), testAppointment.getDate());
        Assertions.assertEquals(testNewsAppointment.getPlace(), testAppointment.getCampusLocation() + " " + testAppointment.getRoom());
    }

}