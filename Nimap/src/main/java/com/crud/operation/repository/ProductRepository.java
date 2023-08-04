package com.crud.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.operation.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
