package de.fhe.ai.appointment.model;

import de.fhe.ai.appointment.storage.core.AbstractDatabaseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment extends AbstractDatabaseEntity {

    private String name;

    private int creator;

    private LocalDateTime date;

    private String repetition;

    private String campusLocation;

    private String room;

    private String description;
}
