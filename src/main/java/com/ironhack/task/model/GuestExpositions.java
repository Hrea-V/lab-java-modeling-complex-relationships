package com.ironhack.task.model;

import com.ironhack.task.enums.GuestStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "guests_expositions")
public class GuestExpositions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "event_expositions_id")
    private EventExpositions event;


    public GuestExpositions(String name, GuestStatus status, EventExpositions event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }
}
