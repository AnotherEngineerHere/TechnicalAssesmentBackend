package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.model.Reservation;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientService {
	
    @Autowired
    private ClientRepository clientRepository;

	public List<Client> findAll() {
		return clientRepository.findAll();
	}
}
