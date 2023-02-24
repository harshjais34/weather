package com.example.weather;

import org.springframework.data.jpa.repository.JpaRepository;

public interface weatherRepository extends JpaRepository<weathermodel,Integer> {
}
