package com.IronHack.Lab2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class GreetingController {

    @GetMapping
    public String greeting() {
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name;

    }
    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable double num1, @PathVariable double num2) {
        return num1 + " + " + num2;

    }

    @GetMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable double num1, @PathVariable double num2) {
        return "Product of " + num1 + " and " + num2 + " is " + num1 * num2;

    }
}
