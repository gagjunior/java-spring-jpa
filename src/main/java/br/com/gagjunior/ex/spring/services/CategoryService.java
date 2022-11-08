package br.com.gagjunior.ex.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gagjunior.ex.spring.entities.Category;
import br.com.gagjunior.ex.spring.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
	return categoryRepository.findAll();
    }
    
    public Category findById(Long id) {
	return categoryRepository.findById(id).orElse(null);
    }
}
