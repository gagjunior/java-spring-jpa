package br.com.gagjunior.ex.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gagjunior.ex.spring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
