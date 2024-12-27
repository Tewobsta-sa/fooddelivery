package com.softwareproject.fooddelivery.mock2;

import com.softwareproject.fooddelivery.mock.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<student, Integer> {
}
