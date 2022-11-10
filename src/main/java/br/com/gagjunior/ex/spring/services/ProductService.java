package br.com.gagjunior.ex.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gagjunior.ex.spring.entities.Product;
import br.com.gagjunior.ex.spring.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
	return productRepository.findAll();
    }

    public Product findById(Long id) {
	return productRepository.findById(id).orElse(null);
    }
}
