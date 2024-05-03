package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ScreeningRepository;

@Service
public class ScreeningService {
    @Autowired
    private ScreeningRepository screeningRepository;

}
