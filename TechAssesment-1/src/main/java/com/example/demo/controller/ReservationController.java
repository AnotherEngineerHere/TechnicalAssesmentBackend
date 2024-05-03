package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.model.Reservation;
import com.example.demo.service.ClientService;
import com.example.demo.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	
    @Autowired
    private ReservationService reservationService;

    @Autowired
    private ClientService clientService;
    
    @PostMapping("/")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }
    @GetMapping("/")
    public List<Reservation> getAllReservation() {
        return reservationService.findAll();
    }
    @GetMapping("/{id}")
    public List<Reservation> getReservationById(@RequestParam Long id) {
        return reservationService.findAll();
    }

    @GetMapping("/clients")
    public List<Client> findAllClients() {
        return clientService.findAll();
    }
    @DeleteMapping("/{id}")
    public void cancelReservation(@PathVariable Long id) {
        reservationService.cancelReservation(id);
    }
    
    @GetMapping("/status")
    public String status() {
        return "Up and running";
    }
}