package com.softwareproject.fooddelivery.repositories;

import com.softwareproject.fooddelivery.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    // Custom method to find all available drivers
    List<Driver> findByAvailabilityTrue();
}
