package org.spring.course.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Say hello!!!");
        return "Hi Folks!";
    }

}
