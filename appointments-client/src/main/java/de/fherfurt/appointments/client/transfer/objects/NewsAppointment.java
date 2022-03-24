package de.fherfurt.appointments.client.transfer.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * container that holds the information of an {@link NewsAppointment} for the news service
 *
 * @author Jonas Helmboldt
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsAppointment {
    /**
     * unique identifier
     */
    int id;
    /**
     * name of news appointment
     */
    private String name;
    /**
     * date of news appointment
     */
    private LocalDateTime date;
    /**
     * place of news appointment (concat campus and room)
     */
    private String place;
}

