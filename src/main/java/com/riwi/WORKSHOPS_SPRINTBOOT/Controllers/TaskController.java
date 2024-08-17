package com.riwi.WORKSHOPS_SPRINTBOOT.Controllers;
import java.util.*;
import com.riwi.WORKSHOPS_SPRINTBOOT.Entities.Task;
import com.riwi.WORKSHOPS_SPRINTBOOT.Services.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TaskController {

    @Autowired
    private TaskService taskService;
    
    @GetMapping("/task/all")
    public List<Task> getAllTask(){
      return taskService.getAllTask();
    }

    @GetMapping("/task{id}")
    public String getTaskById(
            @PathVariable Integer id){
        return "El id de la tarea es: 1";
    }

    @PostMapping("/task")
    public String createTask(
            @RequestBody Task task){
        return task.toString();
    }

/*     @PutMapping("/{id}")
    public String updateTask (
            @PathVariable Integer id, @RequestBody Task task){
        return 
    } */

    @DeleteMapping("/task/delete/{id}")
    public String deleteTask(
            @RequestParam Integer id){
        return String.format("El id %d fue eliminado", id);
    }

}
