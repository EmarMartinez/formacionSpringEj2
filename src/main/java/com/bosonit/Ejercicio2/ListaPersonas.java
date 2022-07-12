package com.bosonit.Ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListaPersonas {
    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> listaPrueba() {
        Persona persona = new Persona();
        List<Persona> listaPrueba = persona.listPersonasPrueba();
        return listaPrueba;
    }
}
