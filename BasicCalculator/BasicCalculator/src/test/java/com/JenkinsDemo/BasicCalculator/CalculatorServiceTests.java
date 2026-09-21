package com.JenkinsDemo.BasicCalculator;


import com.JenkinsDemo.BasicCalculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTests {

    private final CalculatorService calculatorService= new CalculatorService();

    @Test
    void shouldAddNumbers(){
        assertEquals(5, calculatorService.add(2,3));
    }


    @Test
    void shouldMultiplyNumbers(){
        assertEquals(6, calculatorService.multiply(2,3));
    }

}
