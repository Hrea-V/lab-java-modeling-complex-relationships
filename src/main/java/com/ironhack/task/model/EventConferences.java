package com.ironhack.task.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Table(name = "events_conferences")
public class EventConferences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Calendar date;
    private Integer duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event_conferences")
    private List<GuestConferences> guestConferences;

    @OneToMany(mappedBy = "event")
    private List<Speaker> speakers;

    public EventConferences(Calendar date, Integer duration, String location, String title, List<GuestConferences> guestConferences, List<Speaker> speakers) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guestConferences = guestConferences;
        this.speakers = speakers;
    }
}
