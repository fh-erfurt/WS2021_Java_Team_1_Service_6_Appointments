package de.fherfurt.appointments.models;

import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreatorTest {

    Professor TestProfessor = new Professor("Test","12345");
    @Test
    void TestaddONEAppointment() {
        //given
        Appointment TestAppointment = new Appointment("Test",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Student RandomName = new Student("Random Name","12345");
        //when
        RandomName.addAppointment(TestAppointment);
        //then
        Assert.assertEquals(RandomName.getTermine(), Arrays.asList("TestAppointment"));
    }
    @Test
    void TestaddSEVERALAppointments() {
        //given
        Appointment TestAppointment1 = new Appointment("Test1",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment2 = new Appointment("Test2",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment3 = new Appointment("Test3",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Student RandomName = new Student("Random Name","12345");
        //when
        RandomName.addAppointment(TestAppointment1,TestAppointment2,TestAppointment3);
        //then
        Assert.assertEquals(RandomName.getTermine(), Arrays.asList("TestAppointment1","TestAppointment2","TestAppointment3"));
    }

    @Test
    void TestdelONEAppointment() {
        //given
        Appointment TestAppointment1 = new Appointment("Test1",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment2 = new Appointment("Test2",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Student RandomName = new Student("Random Name","12345");
        RandomName.addAppointment(TestAppointment1,TestAppointment2);
        //when
        RandomName.delAppointment(TestAppointment1);
        //then
        Assert.assertEquals(RandomName.getTermine(), Arrays.asList("TestAppointment2"));

    }
    @Test
    void TestdelSEVERALAppointments_OneAppointmentunsigned() {
        //given
        Appointment TestAppointment1 = new Appointment("Test1",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment2 = new Appointment("Test2",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment3 = new Appointment("Test3",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Student RandomName = new Student("Random Name","12345");
        RandomName.addAppointment(TestAppointment1,TestAppointment3);
        //when
        RandomName.delAppointment(TestAppointment1,TestAppointment2);
        //then
        Assert.assertEquals(RandomName.getTermine(), Arrays.asList("TestAppointment1","TestAppointment3"));

    }
    @Test
    void TestdelSEVERALAppointments_ALLsigned () {
        //given
        Appointment TestAppointment1 = new Appointment("Test1",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment2 = new Appointment("Test2",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment3 = new Appointment("Test3",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Appointment TestAppointment4 = new Appointment("Test4",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        Student RandomName = new Student("Random Name","12345");
        RandomName.addAppointment(TestAppointment1,TestAppointment2,TestAppointment3,TestAppointment4);
        //when
        RandomName.delAppointment(TestAppointment1,TestAppointment2,TestAppointment3);
        //then
        Assert.assertEquals(RandomName.getTermine(), Arrays.asList("TestAppointment4"));
    }


    @Test
    void TestcreateAppointment_return() { //--> addApointment mus nicht getestet werden da es bereits getestet wurde
        //given

        Appointment expectedAppointment = new Appointment("Test",TestProfessor,2022-03-24,Repetition.ONCE,Campus.ALTONAERCAMPUS,"Test","Test Description");
        //when
        Appointment result = TestProfessor.createAppointment("Test",TestProfessor,, Repetition.ONCE, Campus.ALTONAERCAMPUS,"Test","Test Description");
        //then
        Assert.assertEquals(result,expectedAppointment);
    }
}