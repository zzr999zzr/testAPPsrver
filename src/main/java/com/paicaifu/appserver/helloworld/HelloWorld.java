package com.paicaifu.appserver.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhuzhengrong on 2017/2/17.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello World!";
    }
}
