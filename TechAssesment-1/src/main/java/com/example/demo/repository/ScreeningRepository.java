package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Screening;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

}
