package ru.aws.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aws.example.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class ExampleController {
    @GetMapping("/")
    public List<User> getUsers() {
        List<User> users = List.of(new User(1, "Egor"));
        return users;
    }
}
