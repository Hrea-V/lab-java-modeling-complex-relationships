package com.ironhack.task.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "chapter")
    private List<President> presidents;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Member> members;

    public Chapter(String name, List<President> presidents, List<Member> members) {
        this.name = name;
        this.presidents = presidents;
        this.members = members;
    }
}
