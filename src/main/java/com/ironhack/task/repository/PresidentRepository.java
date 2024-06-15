package com.ironhack.task.repository;

import com.ironhack.task.model.President;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresidentRepository extends JpaRepository<President, Long> {

}
