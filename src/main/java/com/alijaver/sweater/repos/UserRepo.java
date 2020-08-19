package com.alijaver.sweater.repos;

import com.alijaver.sweater.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
