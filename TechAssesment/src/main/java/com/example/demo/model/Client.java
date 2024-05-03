package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Client {
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
}