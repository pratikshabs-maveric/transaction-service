package com.maveric.transactionservice.controller;

import com.maveric.transactionservice.model.User;
import com.maveric.transactionservice.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class MyController {
    @Autowired
    private UsersRepository usersRepository;

     @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user)
    {
        User save = this.usersRepository.save(user);
        return ResponseEntity.ok(save);
    }

    @GetMapping
    public ResponseEntity<?> getUser()
    {
        return ResponseEntity.ok(this.usersRepository.findAll());
    }
}
