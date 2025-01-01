package com.softwareproject.fooddelivery.repositories;

import com.softwareproject.fooddelivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom method to find all orders by a customer ID
    List<Order> findByCustomerId(Long customerId);

    // Custom method to find orders by their status
    List<Order> findByStatus(String status);
}
