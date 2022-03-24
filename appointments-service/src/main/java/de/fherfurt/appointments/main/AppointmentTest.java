package de.fherfurt.appointments.main;

import de.fherfurt.appointments.models.Professor;
import de.fherfurt.appointments.models.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    Professor TestProfessor = new Professor("Test","12345");
    LocalDateTime TestTime = LocalDateTime.now();
    @Test
    void TestaddParticipant() {
        //given
            Appointment TestAppointment = new Appointment("Test",TestProfessor,TestTime, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
            Student RandomName = new Student("Random Name","12345");
        //when
            TestAppointment.addParticipant(RandomName);
        //then
            Assertions.assertEquals(TestAppointment.getParticipants(), Arrays.asList("RandomName"));
    }

    @Test
    void TestunsignedParticipant_Participantissigned() {
        //given
        Appointment TestAppointment = new Appointment("Test",TestProfessor,TestTime, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Student RandomName = new Student("Random Name","12345");
        Student Studenttounsign = new Student("Tobe Deleted","12345");
        TestAppointment.addParticipant(RandomName);
        TestAppointment.addParticipant(Studenttounsign);
        //when
        TestAppointment.unsignedParticipant(Studenttounsign);
        //then
        Assertions.assertEquals(TestAppointment.getParticipants(), Arrays.asList("RandomName"));
    }

    @Test
    void TestunsignedParticipant_ParticipantisNOTsigned() {
        //given
        Appointment TestAppointment = new Appointment("Test",TestProfessor,TestTime, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Student RandomName = new Student("Random Name","12345");
        Student Studenttounsign = new Student("Tobe Deleted","12345");
        TestAppointment.addParticipant(RandomName);
        //when
        TestAppointment.unsignedParticipant(Studenttounsign);
        //then
        Assertions.assertEquals(TestAppointment.getParticipants(), Arrays.asList("RandomName"));
    }

    /*@Test --> nicht benötigt weil delAppointmentwird getestet(funktion ruft nur delAppointment auf
    void TestcloseAppointment() {
        //given

        //when

        //then
    }*/
}