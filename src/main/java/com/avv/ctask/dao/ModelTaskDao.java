package com.avv.ctask.dao;

import com.avv.ctask.model.ModelTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelTaskDao extends JpaRepository<ModelTask, Long>, ModelTaskDaoCustom {
}
