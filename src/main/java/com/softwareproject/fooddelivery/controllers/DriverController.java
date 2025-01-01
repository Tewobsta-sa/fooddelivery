package com.softwareproject.fooddelivery.controllers;

import com.softwareproject.fooddelivery.entities.Driver;
import com.softwareproject.fooddelivery.services.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    // Get all drivers
    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    // Get available drivers
    @GetMapping("/available")
    public List<Driver> getAvailableDrivers() {
        return driverService.getAvailableDrivers();
    }

    // Update driver availability
    @PutMapping("/{id}/availability")
    public Driver updateDriverAvailability(@PathVariable Long id, @RequestParam Boolean availability) {
        return driverService.updateDriverAvailability(id, availability);
    }
}
