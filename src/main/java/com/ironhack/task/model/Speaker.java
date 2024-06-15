package com.ironhack.task.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "speaker")
@NoArgsConstructor
@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer presentationDuration;
    @ManyToOne
    @JoinColumn(name = "eventConference_id", referencedColumnName = "id")
    private EventConference eventConference;


    public Speaker(String name, Integer presentationDuration, EventConference eventConference) {
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.eventConference = eventConference;
    }

}
