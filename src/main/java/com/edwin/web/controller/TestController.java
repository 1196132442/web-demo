package com.edwin.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 书生
 */
@RestController
public class TestController {

    @GetMapping("t1")
    public String success() {
        return "t1-success";
    }
}
