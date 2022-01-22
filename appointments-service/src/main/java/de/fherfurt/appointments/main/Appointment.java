package  de.fherfurt.appointments.main;


import java.time.LocalDateTime;

public class Appointment {
   private int id;
   private String name;
   private String creator;
   private LocalDateTime date;
   private Repetition repetition;
   private Campus campusLocation;
   private String room;
   private String description;
    //int numberParticipants;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCreator(String creator) {
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

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCreator() {
        return creator;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public Campus getCampusLocation() {
        return campusLocation;
    }
    public Repetition getRepetition() {return repetition;}
    public String getRoom() {
        return room;
    }
    public String getDescription() {
        return description;
    }


    public Appointment(){}
    public Appointment(LocalDateTime dateInput){
        this.date = dateInput;
    }

}

