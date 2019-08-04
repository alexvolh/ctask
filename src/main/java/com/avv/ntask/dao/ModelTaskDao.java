package com.avv.ntask.dao;

import com.avv.ntask.model.ModelTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelTaskDao extends JpaRepository<ModelTask, Long>, ModelTaskDaoCustom {
}
