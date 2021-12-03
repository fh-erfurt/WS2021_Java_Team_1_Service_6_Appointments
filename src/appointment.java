import java.util.Date;

public class appointment {
    int id;
    String name;
    String creator;
    Date date;
    campus campuslocation;
    String room;
    String description;
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









}

