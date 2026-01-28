package com.suleiman.InventoryManagementSystem.repository;

import com.suleiman.InventoryManagementSystem.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
