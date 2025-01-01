package com.softwareproject.fooddelivery.repositories;

import com.softwareproject.fooddelivery.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Custom method to find a payment by order ID
    Payment findByOrderId(Long orderId);
}
