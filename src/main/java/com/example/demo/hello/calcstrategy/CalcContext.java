package com.example.demo.hello.calcstrategy;

public class CalcContext {

    private CalcStrategy calcStrategy;

    public CalcContext(CalcStrategy calcStrategy){
        this.calcStrategy = calcStrategy;
    }

    public int executeStrategy(int num1, int num2){
        return calcStrategy.calc(num1, num2);
    }
}
