package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Reservation;
import com.example.demo.repository.ReservationRepository;

@Service
public class ReservationService {
	
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void cancelReservation(Long id) {
        reservationRepository.deleteById(id);
    }

	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}
    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }
}
