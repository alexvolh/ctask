package com.avv.ctask.service;

import com.avv.ctask.model.ModelTask;

import java.util.List;

public interface TaskService {
    ModelTask read(Long id);
    List<ModelTask> readAll();
}
