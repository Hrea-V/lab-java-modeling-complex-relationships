package com.ironhack.task.model;

import com.ironhack.task.enums.GuestStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "guests_conference")
public class GuestConference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "eventConference_id", referencedColumnName = "id")
    private EventConference eventConference;


    public GuestConference(String name, GuestStatus status, EventConference eventConference) {
        this.name = name;
        this.status = status;
        this.eventConference = eventConference;
    }
}
