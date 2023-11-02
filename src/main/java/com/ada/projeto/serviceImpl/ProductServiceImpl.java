package com.ada.projeto.serviceImpl;

import com.ada.projeto.dto.request.ProductRequestDTO;
import com.ada.projeto.model.Product;
import com.ada.projeto.repository.ProductRepository;
import com.ada.projeto.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(ProductRequestDTO productRequestDTO) {
        Product product = new Product();
        product.setNome(productRequestDTO.getNome());
        product.setPreco(productRequestDTO.getPreco());
        product.setDescricao(productRequestDTO.getDescricao());
        product.setCategoria(productRequestDTO.getCategoria());
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId, ProductRequestDTO productRequestDTO) {
        Product existingProduct = productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));

        existingProduct.setNome(productRequestDTO.getNome());
        existingProduct.setPreco(productRequestDTO.getPreco());
        existingProduct.setDescricao(productRequestDTO.getDescricao());
        existingProduct.setCategoria(productRequestDTO.getCategoria());

        return productRepository.save(existingProduct);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
