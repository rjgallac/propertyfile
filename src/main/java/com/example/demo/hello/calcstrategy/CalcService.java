package com.example.demo.hello.calcstrategy;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public int oldCalc(){
        CalcContext calcContext = new CalcContext(new OldCalc());
        return calcContext.executeStrategy(1, 2);
    }

    public int newCalc() {
        CalcContext calcContext = new CalcContext(new NewCalc());
        return calcContext.executeStrategy(1, 2);
    }

}
