package com.example.demo.hello.springstrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
@RequestMapping("dev")
public class DevProfile {

    @Autowired
    private DevContext devContext;

    @GetMapping
    public int get(){
        return devContext.executeStrategy(1, 2);
    }
}
