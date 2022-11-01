package br.com.gagjunior.ex.spring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gagjunior.ex.spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

//    @GetMapping
//    public ResponseEntity<User> findAll() {
//	User u = new User(1L, "Gilberto", "fulano@gmail.com", "998756544", null);
//	return ResponseEntity.ok(u);
//    }

}
