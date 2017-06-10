package com.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Prateek on 5/11/2017.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "Hi";
    }

    @RequestMapping("/hello")
    public String saayHiHello(){
        return "Hi Hello !!!";
    }
}
