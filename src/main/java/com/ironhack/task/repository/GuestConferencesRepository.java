package com.ironhack.task.repository;

import com.ironhack.task.model.GuestConference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestConferencesRepository extends JpaRepository<GuestConference, Long> {
}
