package com.ironhack.task.model;

import com.ironhack.task.enums.GuestStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "guestsExposition")
public class GuestExposition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "eventExposition_id", referencedColumnName = "id")
    private EventExposition eventExposition;


    public GuestExposition(String name, GuestStatus status, EventExposition eventExposition) {
        this.name = name;
        this.status = status;
        this.eventExposition = eventExposition;
    }
}
