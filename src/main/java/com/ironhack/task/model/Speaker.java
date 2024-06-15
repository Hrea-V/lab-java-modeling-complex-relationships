package com.ironhack.task.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Data
@Table(name = "speakers")
@NoArgsConstructor
@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer presentationDuration;
    @ManyToOne
    @JoinColumn(name = "event_conferences_id")
    private EventConferences event;


    public Speaker(String name, Integer presentationDuration, EventConferences event) {
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.event = event;
    }

}
