package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Reservation {
    @Id
    private Long id;
    private Long clientId;
    private Long screeningId;
    private int numberOfSeats;
    // Getters y setters
}