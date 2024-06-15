package com.ironhack.task.demo;

import com.ironhack.task.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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


    }
}
