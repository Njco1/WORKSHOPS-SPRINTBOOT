package com.riwi.WORKSHOPS_SPRINTBOOT.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import java.time.*;

@Entity
@Table(name = "Tarea")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description_tarea;
    private LocalDate date_creation;
    private LocalTime time_creation;
    private String state;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription_tarea() {
        return description_tarea;
    }
    public void setDescription_tarea(String description_tarea) {
        this.description_tarea = description_tarea;
    }
    public LocalDate getDate_creation() {
        return date_creation;
    }
    public void setDate_creation(LocalDate date_creation) {
        this.date_creation = date_creation;
    }
    public LocalTime getTime_creation() {
        return time_creation;
    }
    public void setTime_creation(LocalTime time_creation) {
        this.time_creation = time_creation;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Task {id=" + id + 
                ", title=" + title + 
                ", description_tarea=" + description_tarea + 
                ", date_creation=" + date_creation + 
                ", time_creation=" + time_creation + 
                ", state=" + state + 
                "}";
    }

    

    
}