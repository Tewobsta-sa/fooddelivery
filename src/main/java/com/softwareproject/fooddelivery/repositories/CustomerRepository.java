package com.softwareproject.fooddelivery.repositories;

import com.softwareproject.fooddelivery.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom method to find a customer by email
    Customer findByEmail(String email);
}
