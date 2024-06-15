package com.ironhack.task.demo;

import com.ironhack.task.enums.GuestStatus;
import com.ironhack.task.enums.MemberStatus;
import com.ironhack.task.model.*;
import com.ironhack.task.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {


    private final ChapterRepository chapterRepository;
    private final MemberRepository memberRepository;
    private final PresidentRepository presidentRepository;
    private final EventExpositionsRepository eventExpositionsRepository;
    private final GuestConferencesRepository guestConferencesRepository;
    private final SpeakerRepository speakerRepository;
    private final EventConferencesRepository eventConferencesRepository;
    private final GuestExpositionsRepository guestExpositionsRepository;




    @Override
    public void run(String... args) throws Exception {
        Member member = new Member("John", MemberStatus.ACTIVE, Calendar.getInstance());
        memberRepository.save(member);
        Chapter chapter = new Chapter("Chapter 1", new ArrayList<>());
        chapterRepository.save(chapter);
        President president = new President("Sam", chapterRepository.findById(1L).get());
        presidentRepository.save(president);


//        GuestConference guestConference1 = new GuestConference("Alice", GuestStatus.ATTENDING, eventConferencesRepository.findById(1L).get());;
//        guestConferencesRepository.save(guestConference1);
//        Speaker speaker1 = new Speaker("Tom", 1, eventConferencesRepository.findById(1L).get());
//        speakerRepository.save(speaker1);
//        EventConference eventConference = new EventConference(Calendar.getInstance(), 5, "New York", "Data Science",guestConferencesRepository.findAll(), speakerRepository.findAll());
//        eventConferencesRepository.save(eventConference);






    }
}
