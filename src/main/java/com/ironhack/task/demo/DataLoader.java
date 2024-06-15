package com.ironhack.task.demo;

import com.ironhack.task.enums.GuestStatus;
import com.ironhack.task.enums.MemberStatus;
import com.ironhack.task.model.*;
import com.ironhack.task.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ChapterRepository chapterRepository;
    private MemberRepository memberRepository;
    private PresidentRepository presidentRepository;

    private EventExpositionsRepository eventExpositionsRepository;
    private GuestConferencesRepository guestConferencesRepository;
    private SpeakerRepository speakerRepository;

    private EventConferencesRepository eventConferencesRepository;
    private GuestExpositionsRepository guestExpositionsRepository;




    @Override
    public void run(String... args) throws Exception {
        Member member = new Member("John", MemberStatus.ACTIVE, Calendar.getInstance());
        President president = new President("Sam", chapterRepository.findById(1L).get());
        Chapter chapter = new Chapter("Chapter 1", president, new ArrayList<>());


        chapterRepository.save(chapter);
        memberRepository.save(member);
        presidentRepository.save(president);



        GuestConferences guestConference1 = new GuestConferences("Alice", GuestStatus.ATTENDING, eventConferencesRepository.findById(1L).get());;
        Speaker speaker1 = new Speaker("Tom", 1, eventConferencesRepository.findById(1L).get());
        EventConferences eventConferences = new EventConferences(Calendar.getInstance(), 5, "New York", "Data Science",guestConferencesRepository.findAll(), speakerRepository.findAll());


        guestConferencesRepository.save(guestConference1);
        speakerRepository.save(speaker1);
        eventConferencesRepository.save(eventConferences);


    }
}
