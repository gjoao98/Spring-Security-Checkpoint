package com.security.checpoint.Security.repository;

import com.security.checpoint.Security.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTitle(String title);
}