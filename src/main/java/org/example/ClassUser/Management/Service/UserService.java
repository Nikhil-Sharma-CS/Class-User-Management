package org.example.ClassUser.Management.Service;


import org.example.ClassUser.Management.Model.User;
import org.example.ClassUser.Management.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public String addUsers(List<User> users) {
        userRepo.saveAll(users);
        return "Users Saved";
    }

    public String deleteUser(Integer id) {
        if(userRepo.existsById(id))
        {
            userRepo.deleteById(id);
            return "User deleted";
        }
        return "User with Id not found";
    }

    public String updateAge(Integer id, Integer age) {
        User user = userRepo.findById(id).orElse(null);

        if(user != null)
        {
            user.setUserAge(age);
            userRepo.save(user);
            return "User age updated";
        }
        return "User with Id not found";
    }
}
