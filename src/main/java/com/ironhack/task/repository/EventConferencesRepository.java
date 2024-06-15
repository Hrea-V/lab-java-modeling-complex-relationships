package com.ironhack.task.repository;

import com.ironhack.task.model.EventConference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventConferencesRepository extends JpaRepository<EventConference, Long> {

}
