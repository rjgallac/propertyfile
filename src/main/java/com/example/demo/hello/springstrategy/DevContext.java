package com.example.demo.hello.springstrategy;

import com.example.demo.hello.calcstrategy.CalcStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DevContext {

    @Autowired
    @Qualifier("calcBean")
    private CalcStrategy calcStrategy;

    public int executeStrategy(int num1, int num2){
        return calcStrategy.calc(num1, num2);
    }
}
