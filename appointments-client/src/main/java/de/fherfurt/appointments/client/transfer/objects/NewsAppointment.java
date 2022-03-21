package de.fherfurt.appointments.client.transfer.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
public class NewsAppointment {
    int id;
    private String name;
    private LocalDateTime date;
    private String place;
}
