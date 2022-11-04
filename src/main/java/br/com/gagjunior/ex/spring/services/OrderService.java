package br.com.gagjunior.ex.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gagjunior.ex.spring.entities.Order;
import br.com.gagjunior.ex.spring.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
	return OrderRepository.findAll();
    }
    
    public Order findById(Long id) {
	return OrderRepository.findById(id).orElse(null);
    }
}
