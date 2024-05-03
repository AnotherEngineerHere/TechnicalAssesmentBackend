package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Screening {
    @Id
    private Long id;
    private Long movieId;
    private Long roomId;
    private Date startTime;
}
