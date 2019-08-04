package com.avv.ntask.service;

import com.avv.ntask.model.ModelTask;

import java.util.List;

public interface TaskService {
    ModelTask read(Long id);
    List<ModelTask> readAll();
}
