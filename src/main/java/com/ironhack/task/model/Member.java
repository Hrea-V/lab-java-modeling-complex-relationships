package com.ironhack.task.model;

import com.ironhack.task.enums.MemberStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Calendar;

@Data
@Table(name = "members")
@NoArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private MemberStatus status;
    private Calendar renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Member(String name, MemberStatus status, Calendar renewalDate, Chapter chapter) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.chapter = chapter;
    }


    public Member(String name, MemberStatus status, Calendar renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

}
