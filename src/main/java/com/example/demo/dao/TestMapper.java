package com.example.demo.dao;

import java.util.List;
import com.example.demo.dto.test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {
    List<test> getTestList();
}
