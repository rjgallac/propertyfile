package com.example.demo.hello.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    TestRepository testRepository;

    @GetMapping("/add")
    public void add(){
        testRepository.save(new TestModel("test"));
    }

    @GetMapping
    public Iterable<TestModel> get(){
        return testRepository.findAll();
    }

}
