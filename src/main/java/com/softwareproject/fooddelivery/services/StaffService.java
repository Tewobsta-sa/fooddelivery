package com.softwareproject.fooddelivery.services;

import com.softwareproject.fooddelivery.entities.Staff;
import com.softwareproject.fooddelivery.repositories.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    // Get all staff members
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    // Create a new staff member
    public Staff createStaff(Staff staff) {
        return staffRepository.save(staff);
    }
}
