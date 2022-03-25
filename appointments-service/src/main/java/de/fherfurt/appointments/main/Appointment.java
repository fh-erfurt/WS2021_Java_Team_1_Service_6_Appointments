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

    /**
     *
     * @param id identifier for every appointment
     * @author jonas helmboldt
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @param name the name of the appointment
     * @author jonas helmboldt
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param creator the author of the appointment
     * @author jonas helmboldt
     */
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    /**
     *
     * @param date the date of the appointment
     * @author jonas helmboldt
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     *
     * @param campusLocation  the location where the appointment start
     * @author jonas helmboldt
     */
    public void setCampusLocation(Campus campusLocation) {
       this.campusLocation = campusLocation;
    }

    /**
     *
     * @param repetition how often the appointment repeat
     * @author jonas helmboldt
     */
    public void setRepetition(Repetition repetition) {
        this.repetition = repetition;
    }

    /**
     *
     * @param room the room number , where the appointment starts
     * @author jonas helmboldt
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     *
     * @param description a short description of the appointment
     * @author jonas helmboldt
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * insert a new  student on the list participant
     * @param student a person who studies , name
     *@author stephan teichmueller
     */

    public void addParticipant(Student student){
        this.participants.add(student);
    }

    /**
     * remove student from the list participant
     * if the list participant is empty
     * @param student
     * @author stephan teichmueller
     */


    public void unsignedParticipant(Student student){
        if (!this.participants.contains(student)){
            return;
        }
        this.participants.remove(student);
    }

    /**
     * delete appointments
     * @author stephan teichmueller
     */


    public void closeAppointment(){
        for (Student student:participants) {
            student.delAppointment(this);

        }
        this.creator.delAppointment(this);

    }

    /**
     *
     * @return the Identifier of the appointment
     * @author jonas helmboldt
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return the name of the appointment
     * @author jonas helmboldt
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return the author of the appointment
     * @author jonas helmboldt
     */
    public Creator getCreator() {
        return this.creator;
    }

    /**
     *
     * @return the date of the appointment
     * @author jonas helmboldt
     */
    public LocalDateTime getDate() {
        return this.date;
    }

    /**
     *
     * @return the location of the appointment
     * @author jonas helmboldt
     */
    public Campus getCampusLocation() {
        return this.campusLocation;
    }

    /**
     *
     * @return the repeat rate of the appointment
     * @author jonas helmboldt
     */
    public Repetition getRepetition() {return repetition;}

    /**
     *
     * @return room number of appointment
     * @author jonas helmboldt
     */
    public String getRoom() {
        return this.room;
    }

    /**
     *
     * @return the description of appointment
     * @author jonas helmboldt
     */
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @return search for the name of the student in list student
     * @author stephan teichmueller
     */

    public List<Student> getParticipants() {
        return this.participants;
    }

    /**
     *
     * @param dateInput insert the date of appointment
     * @author jonas helmboldt
     */

    public Appointment(LocalDateTime dateInput){
        this.date = dateInput;
    }

    /**
     *
     * @param name  the name of appointment
     * @param creator the person who build this appointment
     * @param date  the date  of appointment
     * @param repetition how often repeat the appointment
     * @param campusLocation  in which location of the FHE
     * @param room  the room number of the appointment
     * @param description small description of appointment
     * @author jonas helmboldt
     */

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

