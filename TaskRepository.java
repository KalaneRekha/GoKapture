package com.example.taskmanagment.repository;

import com.example.taskmanagment.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
  // Custom query methods for filtering and searching
}
