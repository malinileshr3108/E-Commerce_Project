package com.nilesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilesh.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
