package com.example.demo.controller;

import java.util.List;
import com.example.demo.dto.test;
import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    private final TestService testService;

    public DemoController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/hello")
    public String hello(){
        log.info("printed hello world");
        List<test> testList = testService.getTestList();
        for(int i=0; i<testList.size() ; i++){
            log.info("num={}, name={}", testList.get(i).getNum(), testList.get(i).getName() );
        }
        return "hello world!!!";
    }
}
