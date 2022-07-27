package com.example.demo.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mvc")
public class MvcController {

    @GetMapping(path = "test")
    public String doSomething() {
        return "hello mvc";
    }
}
