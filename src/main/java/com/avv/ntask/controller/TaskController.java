package com.avv.ntask.controller;

import com.avv.ntask.model.ModelTask;
import com.avv.ntask.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<ModelTask> getTasks() {
        return taskService.readAll();
    }
}
