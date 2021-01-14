package br.com.dynamicdev.usersmanager.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dynamicdev.usersmanager.models.User;

@RestController
@RequestMapping("/users")
public class UsersControllers {

    @GetMapping("/{name}")
    public ResponseEntity<User> getUserByName(@PathVariable String name) {

        var user = User.builder().name(name).lastname("lastname").build();
        return ResponseEntity.ok(user);
    }

}