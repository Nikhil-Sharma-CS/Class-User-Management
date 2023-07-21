package org.example.ClassUser.Management.Repository;

import org.example.ClassUser.Management.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
}
