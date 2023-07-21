package org.example.ClassUser.Management.Controller;

import jakarta.validation.Valid;
import org.example.ClassUser.Management.Model.User;
import org.example.ClassUser.Management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    List<User> getUsers()
    {
        return userService.getUsers();
    }

    @PostMapping("addUsers")
    String addUsers(@RequestBody @Valid List<User> users)
    {
        return userService.addUsers(users);
    }

    @DeleteMapping("deleteUser")
    String deleteUser(@RequestParam Integer id)
    {
        return userService.deleteUser(id);
    }

    @PutMapping("updateAge")
    String updateAge(@RequestParam Integer id, @RequestParam Integer Age)
    {
        return userService.updateAge(id, Age);
    }
}
