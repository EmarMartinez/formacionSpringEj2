package com.bosonit.Ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaUsuario {
    @GetMapping("user/{nombre}")
    @ResponseBody
    public String saludo(@PathVariable String nombre) {
        return "Hola " + nombre;
    }
}
