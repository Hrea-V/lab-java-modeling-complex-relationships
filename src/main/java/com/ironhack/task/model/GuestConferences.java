package com.ironhack.task.model;

import com.ironhack.task.enums.GuestStatus;
import jakarta.persistence.*;
import jdk.jfr.Event;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "guests_conferences")
public class GuestConferences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "event_conferences_id")
    private EventConferences event;


    public GuestConferences(String name, GuestStatus status, EventConferences event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }
}
