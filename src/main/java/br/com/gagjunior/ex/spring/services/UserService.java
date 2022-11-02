package br.com.gagjunior.ex.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gagjunior.ex.spring.entities.User;
import br.com.gagjunior.ex.spring.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
	return userRepository.findAll();
    }
    
    public User findById(Long id) {
	return userRepository.findById(id).orElse(null);
    }
}
