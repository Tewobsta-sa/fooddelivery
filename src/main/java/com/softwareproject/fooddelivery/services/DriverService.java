package com.softwareproject.fooddelivery.services;

import com.softwareproject.fooddelivery.entities.Driver;
import com.softwareproject.fooddelivery.repositories.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    // Get all drivers
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    // Get available drivers
    public List<Driver> getAvailableDrivers() {
        return driverRepository.findByAvailabilityTrue();
    }

    // Update driver availability
    public Driver updateDriverAvailability(Long id, Boolean availability) {
        Driver driver = driverRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setAvailability(availability);
        return driverRepository.save(driver);
    }
}
