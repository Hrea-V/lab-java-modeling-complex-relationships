package com.ironhack.task.repository;

import com.ironhack.task.model.GuestConferences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestConferencesRepository extends JpaRepository<GuestConferences, Long> {
}
