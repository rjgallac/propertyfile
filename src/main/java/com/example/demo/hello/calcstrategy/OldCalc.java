package com.example.demo.hello.calcstrategy;

import com.example.demo.hello.calcstrategy.CalcStrategy;

public class OldCalc implements CalcStrategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2 + 1;
    }
}
