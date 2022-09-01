package com.example.demo.hello.springstrategy;

import com.example.demo.hello.calcstrategy.CalcStrategy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("calcBean")
@Profile("dev")
public class DevCalc implements CalcStrategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
