package com.riwi.WORKSHOPS_SPRINTBOOT.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.WORKSHOPS_SPRINTBOOT.Entities.Task;

public interface TaskRespository extends JpaRepository <Task, Integer> {
    
}