package com.example.demo.hello.calcstrategy;

public class NewCalc implements CalcStrategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
