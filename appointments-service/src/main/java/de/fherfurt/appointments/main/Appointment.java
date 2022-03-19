package de.fherfurt.appointments.main;


import de.fherfurt.appointments.models.Creator;
import de.fherfurt.appointments.models.Professor;
import de.fherfurt.appointments.models.Student;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Appointment {
   private int id;
   private String name;
   private Creator creator;
   private LocalDateTime date;
   private Repetition repetition;
   private Campus campusLocation;
   private String room;
   private String description;
   private List<Student>participants = new ArrayList<>();



    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCreator(Creator creator) {
        this.creator = creator;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public void setCampusLocation(Campus campusLocation) {
       this.campusLocation = campusLocation;
    }
    public void setRepetition(Repetition repetition) {
        this.repetition = repetition;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void addParticipant(Student student){
        this.participants.add(student);
    }
    public void unsignedParticipant(Student student){
        if (!this.participants.contains(student)){
            return;
        }
        this.participants.remove(student);
    }
    public void closeAppointment(){
        for (Student student:participants) {
            student.delAppointment(this);

        }
        this.creator.delAppointment(this);

    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Creator getCreator() {
        return this.creator;
    }
    public LocalDateTime getDate() {
        return this.date;
    }
    public Campus getCampusLocation() {
        return this.campusLocation;
    }
    public Repetition getRepetition() {return repetition;}
    public String getRoom() {
        return this.room;
    }
    public String getDescription() {
        return this.description;
    }

    public List<Student> getParticipants() {
        return this.participants;
    }

    public Appointment(){}
    public Appointment(LocalDateTime dateInput){
        this.date = dateInput;
    }

    public Appointment(String name, Creator creator, LocalDateTime date, Repetition repetition, Campus campusLocation, String room, String description) {
        this.name = name;
        this.creator = creator;
        this.date = date;
        this.repetition = repetition;
        this.campusLocation = campusLocation;
        this.room = room;
        this.description = description;
    }


}

