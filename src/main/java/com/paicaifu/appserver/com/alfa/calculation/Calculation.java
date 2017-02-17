package com.paicaifu.appserver.com.alfa.calculation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengrong on 2017/2/17.
 */

@RestController
public class Calculation {
    @RequestMapping("/add")

    public String add(int a, int b){
        return  String.valueOf(a+b) ;
    }
    @RequestMapping("/multiplication")
    public  String multiplication(int a1, int b1){
        return  String.valueOf(a1)+"*"+String.valueOf(b1)+"="+String.valueOf(a1*b1);

    }

}
