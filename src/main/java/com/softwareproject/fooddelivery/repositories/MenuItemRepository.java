package com.softwareproject.fooddelivery.repositories;

import com.softwareproject.fooddelivery.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    // Custom method to find all available menu items
    List<MenuItem> findByAvailabilityTrue();
}
