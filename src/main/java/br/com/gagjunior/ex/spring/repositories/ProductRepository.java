package br.com.gagjunior.ex.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gagjunior.ex.spring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
