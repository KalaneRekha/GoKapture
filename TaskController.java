package com.example.taskmanagment.controller;

import com.example.taskmanagment.entity.Task;
import com.example.taskmanagment.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
  @Autowired
  private TaskService taskService;

  @PostMapping
  public Task createTask(@RequestBody Task task) {
    return taskService.createTask(task);
  }

  @GetMapping("/{id}")
  public Task getTask(@PathVariable Long id) {
    return taskService.getTask(id);
  }

  @PutMapping("/{id}")
  public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
    task.setId(id);
    return taskService.updateTask(task);
  }

  @DeleteMapping("/{id}")
  public void deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
  }

  @Get
