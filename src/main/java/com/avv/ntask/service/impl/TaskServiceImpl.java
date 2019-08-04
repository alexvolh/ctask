package com.avv.ntask.service.impl;

import com.avv.ntask.dao.ModelTaskDao;
import com.avv.ntask.model.ModelTask;
import com.avv.ntask.service.TaskService;
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
