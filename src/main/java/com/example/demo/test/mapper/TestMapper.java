package com.example.demo.test.mapper;

import com.example.demo.test.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    public List<TestEntity> queryAll();
}
