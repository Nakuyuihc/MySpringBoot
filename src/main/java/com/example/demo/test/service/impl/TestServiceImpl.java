package com.example.demo.test.service.impl;

import com.example.demo.test.entity.TestEntity;
import com.example.demo.test.mapper.TestMapper;
import com.example.demo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestEntity> queryAll() {
        return testMapper.queryAll();
    }
}
