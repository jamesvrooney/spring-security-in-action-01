package com.jamesvrooney.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/greeting")
public class GreetingController {

    @GetMapping("hello")
    public String hello() {
        log.info("Calling hello endpoint.");

        return "Hello";
    }
}
