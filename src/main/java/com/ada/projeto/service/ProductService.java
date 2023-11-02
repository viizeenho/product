package com.ada.projeto.service;

import com.ada.projeto.dto.request.ProductRequestDTO;
import com.ada.projeto.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductRequestDTO productRequestDTO);
    Product updateProduct(Long productId, ProductRequestDTO productRequestDTO);
    void deleteProduct(Long productId);
    Product getProductById(Long productId);
    List<Product> getAllProducts();

}
