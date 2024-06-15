package com.ironhack.task.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Table(name = "eventsConference")
public class EventConference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Calendar date;
    private Integer duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "eventConference")
    private List<GuestConference> guestConferences;

    @OneToMany(mappedBy = "eventConference")
    private List<Speaker> speakers;

    public EventConference(Calendar date, Integer duration, String location, String title, List<GuestConference> guestConferences, List<Speaker> speakers) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guestConferences = guestConferences;
        this.speakers = speakers;
    }
}
