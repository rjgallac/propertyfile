package com.example.demo.hello.springstrategy;

import com.example.demo.hello.calcstrategy.CalcStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("!dev")
@RestController
@RequestMapping("dev")
public class NotDevProfile {

    @Autowired
    @Qualifier("calcBean")
    private CalcStrategy calcStrategy;

    @GetMapping
    public int get(){
        return calcStrategy.calc(1, 2);
    }

}
