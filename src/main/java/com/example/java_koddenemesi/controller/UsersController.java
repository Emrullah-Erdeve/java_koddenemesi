package com.example.java_koddenemesi.controller;

import com.example.java_koddenemesi.entity.Users;
import com.example.java_koddenemesi.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins= {"http://localhost:4200/"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/users")
public class UsersController {


    @PostMapping("/add")
    public Optional<Users>  saveUser(@RequestBody Users users) {

        return UsersRepository.save(users);

    }

    @GetMapping("/get-user/{id}")
    public Optional<Users> getUser(@PathVariable Long id) {
        long random=UsersRepository.countById(id);
        int min=1;
        int random_int = (int)Math.floor(Math.random() * (random - min + 1) + min);
        return UsersRepository.findById(id);
    }

}
