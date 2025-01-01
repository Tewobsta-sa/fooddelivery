package com.softwareproject.fooddelivery.repositories;

import com.softwareproject.fooddelivery.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    // Additional custom queries can be added here as needed
}
