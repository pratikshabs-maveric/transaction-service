package com.maveric.transactionservice.controller;

import com.maveric.transactionservice.model.User;
import com.maveric.transactionservice.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class TransactionController {
    @Autowired
    private UsersRepository usersRepository;

     @PostMapping("/Transactions")
    public ResponseEntity<?> addUser(@RequestBody User user)
    {
        User save = this.usersRepository.save(user);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/Transactions/")
    public ResponseEntity<?> getUsers()
    {
        return ResponseEntity.ok(this.usersRepository.findAll());
    }

    @GetMapping("/Transactions/{id}")
    public Optional<User> getUser(@PathVariable int id)
    {
        return usersRepository.findById(id);
    }

    @DeleteMapping("Transactions/{id}")
    public String deleteAccount(@PathVariable int id)
    {
        usersRepository.deleteById(id);
        return "transaction Deleted with id " + id;
    }


}
