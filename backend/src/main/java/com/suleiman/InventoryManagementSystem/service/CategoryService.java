package com.suleiman.InventoryManagementSystem.service;

import com.suleiman.InventoryManagementSystem.dto.CategoryDTO;
import com.suleiman.InventoryManagementSystem.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDTO categoryDTO);
    Response getAllCategories();
    Response getCategoryById(Long id);
    Response updateCategory(Long id, CategoryDTO categoryDTO);
    Response deleteCategory(Long id);
}
