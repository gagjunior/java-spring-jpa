package br.com.gagjunior.ex.spring.services;

import br.com.gagjunior.ex.spring.entities.User;
import br.com.gagjunior.ex.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public User insertUser(User user) {
        if (user == null) {
            return null;
        }
        return userRepository.save(user);
    }
}
