package com.JenkinsDemo.BasicCalculator.controller;


import com.JenkinsDemo.BasicCalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }


    @GetMapping("/health")
    public Map<String, String> getHealth(){
        return Map.of(
                "status", "up",
                "service", "Jenkins-spring-demo",
                "version", System.getenv().getOrDefault("APP_VERSION", "dev")
        );
    }

    @GetMapping("/add")
    public int addNumbers(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculatorService.add(a,b);
    }


    @GetMapping("/multiply")
    public int multipleNumbers(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculatorService.multiply(a,b);
    }


    @GetMapping("/substract")
    public int substractNumbers(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculatorService.substract(a,b);
    }


}
