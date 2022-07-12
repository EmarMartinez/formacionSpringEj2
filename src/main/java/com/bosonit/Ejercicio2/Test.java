package com.bosonit.Ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/mundo")
    public String holaMundo() {
        return "Hola Mundo";
    }
}