package com.avv.ctask.service.impl;

import com.avv.ctask.dao.ModelTaskDao;
import com.avv.ctask.model.ModelTask;
import com.avv.ctask.service.TaskService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final ModelTaskDao modelTaskDao;

    public TaskServiceImpl(ModelTaskDao modelTaskDao) {
        this.modelTaskDao = modelTaskDao;
    }

    @Override
    @Transactional(readOnly = true)
    public ModelTask read(Long id) {
        Optional<ModelTask> task = modelTaskDao.findById(id);
        return task.orElseThrow(() -> new RuntimeException(""));
    }

    @Override
    @Transactional(readOnly = true)
    public List<ModelTask> readAll() {
        return modelTaskDao.findAll();
    }
}
