package com.example.taskmanagment.service;

import com.example.taskmanagment.entity.Task;
import com.example.taskmanagment.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
  @Autowired
  private TaskRepository taskRepository;

  public Task createTask(Task task) {
    return taskRepository.save(task);
  }

  public Task getTask(Long id) {
    return taskRepository.findById(id).orElse(null);
  }

  public Task updateTask(Task task) {
    return taskRepository.save(task);
  }

  public void deleteTask(Long id) {
    taskRepository.deleteById(id);
  }

  // Additional methods for filtering and searching
}
