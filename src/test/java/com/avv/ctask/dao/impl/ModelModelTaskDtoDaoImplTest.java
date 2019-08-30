package com.avv.ctask.dao.impl;

import com.avv.ctask.dao.ModelTaskDao;
import com.avv.ctask.model.ModelTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class ModelModelTaskDtoDaoImplTest {

    @Autowired
    private ModelTaskDao modelTaskDao;


    @Test
    public void testReadAllTasks() {
        List<ModelTask> tasks = modelTaskDao.findAll();
        log.info("Size of the tasks : {}", tasks.size());
        log.info("First TaskDto: {}", tasks.get(0).toString());
    }
}
