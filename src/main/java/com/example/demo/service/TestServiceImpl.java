package com.example.demo.service;

import com.example.demo.dao.TestMapper;
import com.example.demo.dto.test;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

/*    private final TestMapper testMapper;

    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }*/

    @Autowired
    TestMapper testMapper;

    @Override
    public List<test> getTestList() {
        return testMapper.getTestList();
    }
}
