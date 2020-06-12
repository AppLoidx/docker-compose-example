package com.apploidxxx.dockercomposeexampleapi;

import com.apploidxxx.dockercomposeexampleapi.data.HelloData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Arthur Kupriyanov on 12.06.2020
 */
@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping
    public HelloData helloWorld() {
        return new HelloData("Ohayo!");
    }
}
