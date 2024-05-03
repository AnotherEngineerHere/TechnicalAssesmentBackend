package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movie {
    @Id
    private Long id;
    private String title;
    private String director;
    private int duration;
    private Date releaseDate;
}