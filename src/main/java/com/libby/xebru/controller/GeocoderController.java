package com.libby.xebru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeocoderController {

    @GetMapping("/test")
    public String test() {
        return "service up";
    }
}
