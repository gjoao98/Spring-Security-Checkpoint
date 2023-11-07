package com.security.checpoint.Security.repository;

import com.security.checpoint.Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>  {
    User findByUsername(String username);
}
