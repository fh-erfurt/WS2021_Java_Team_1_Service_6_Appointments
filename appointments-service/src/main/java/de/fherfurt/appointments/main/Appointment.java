package de.fherfurt.appointments.main;

import de.fherfurt.appointments.storage.core.AbstractDatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment extends AbstractDatabaseEntity {
   private String name;
   private int creator;
   private LocalDateTime date;
   private Repetition repetition;
   private Campus campusLocation;
   private String room;
   private String description;
   @ElementCollection                           //
   private List<Integer> participants;


    public Appointment(LocalDateTime dateInput){
        this.date = dateInput;
    }
}

