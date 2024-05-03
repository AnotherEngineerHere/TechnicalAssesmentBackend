package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Reservation {
	@SequenceGenerator(name = "reservation_sequence", sequenceName = "reservation_sequence", allocationSize = 1)
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_sequence")
	 private Long id;
	    
    private Long clientId;
    private Long screeningId;
    private int numberOfSeats;
}