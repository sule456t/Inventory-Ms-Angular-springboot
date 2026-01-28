package com.suleiman.InventoryManagementSystem.service;

import com.suleiman.InventoryManagementSystem.dto.ProductDTO;
import com.suleiman.InventoryManagementSystem.dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response getAllProducts();
    Response getProductById(Long id);
    Response deleteProduct(Long id);
}
