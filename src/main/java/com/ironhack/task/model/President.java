package com.ironhack.task.model;

import com.ironhack.task.enums.MemberStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Table(name = "presidents")
@NoArgsConstructor
@Entity
public class President {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;



    public President(String name, Chapter chapter) {
        this.name = name;
        this.chapter = chapter;
    }

}
