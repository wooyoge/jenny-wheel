package com.wooyooge.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hey")
public class HeyJennyController {

    @GetMapping("jenny")
    public String helloWorld() {
        return "Hey Jenny";
    }
}
