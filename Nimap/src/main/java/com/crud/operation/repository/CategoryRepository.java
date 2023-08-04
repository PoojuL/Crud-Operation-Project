package com.crud.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.operation.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
