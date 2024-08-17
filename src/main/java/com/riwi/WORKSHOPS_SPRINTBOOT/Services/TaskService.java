package com.riwi.WORKSHOPS_SPRINTBOOT.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.riwi.WORKSHOPS_SPRINTBOOT.Entities.Task;
import com.riwi.WORKSHOPS_SPRINTBOOT.Repositories.TaskRespository;

@Service
public class TaskService {

    @Autowired
    private TaskRespository taskRespository;

    public List<Task> getAllTask(){
        return taskRespository.findAll();
    }

    public Optional<Task> getTaskById(Integer id){
        return taskRespository.findById(id);
    }

    public Task saveTask(Task task){
        return taskRespository.save(task);
    }

    public void deleteTask(Integer id){
        taskRespository.deleteById(id);
    }

}