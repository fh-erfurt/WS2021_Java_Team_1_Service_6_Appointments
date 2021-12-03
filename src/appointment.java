import java.util.Date;

public class appointment {
   private int id;
   private String name;
   private String creator;
   private Date date;
   private campus campuslocation;
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
    public void setDate(Date date) {
        this.date = date;
    }
    public void setCampuslocation(campus campuslocation) {
        this.campuslocation = campuslocation;
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
    public Date getDate() {
        return date;
    }
    public campus getCampuslocation() {
        return campuslocation;
    }
    public String getRoom() {
        return room;
    }
    public String getDescription() {
        return description;
    }


    public appointment(){}
    public appointment(int a_id, String a_name, String a_creator, Date a_date, campus a_campuslocation, String a_room, String a_description){
        this.id = a_id;
        this.name = a_name;
        this.creator = a_creator;
        this.date = a_date;
        this.campuslocation =a_campuslocation;
        this.room = a_room;
        this.description = a_description;
    }
}

