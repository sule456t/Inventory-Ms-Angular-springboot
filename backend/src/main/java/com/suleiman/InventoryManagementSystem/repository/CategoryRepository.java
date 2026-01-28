package com.suleiman.InventoryManagementSystem.repository;

import com.suleiman.InventoryManagementSystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
