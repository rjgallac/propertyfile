package com.example.demo.hello;

import com.example.demo.hello.calcstrategy.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HelloController {

    @Autowired
    Props props;

    @Autowired
    Props2 props2;

    @Autowired
    CalcService calcService;

    @GetMapping
    public String hi() {
        return "hi"+props.getProp()+props2.getProp();
    }

    @GetMapping("calcold")
    public int calcold(){
        return calcService.oldCalc();
    }

    @GetMapping("calcnew")
    public int calcnew(){
        return calcService.newCalc();
    }

}
