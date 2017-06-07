package adapp.controller;

import adapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import adapp.repository.UserRepository;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/users/")
    @ResponseBody
    List<User> users(){
        List<User> users = repository.findAll();
        return users;
    }
}