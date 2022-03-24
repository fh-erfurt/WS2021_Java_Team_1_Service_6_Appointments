package de.fherfurt.appointments.models;

import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;



class ProfessorTest {
    //redirecting the system out
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    void TestinformStudents() {
        //given
        LocalDateTime TestTime = LocalDateTime.now();
        Professor TestProfessor = new Professor("Test","12345");
        Student student1 = new Student("Franz", "12345");
        Appointment TestAppointment1 = TestProfessor.createAppointment("Test",TestTime, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        student1.addAppointment(TestAppointment1);
        TestAppointment1.addParticipant(student1);


        //when
        TestProfessor.informStudents(TestAppointment1, "Der Test morgen fällt aus.");
        //then
        Assertions.assertEquals( outputStreamCaptor.toString().trim(),"Franz Informed with: Der Test morgen fällt aus.");
    }
}