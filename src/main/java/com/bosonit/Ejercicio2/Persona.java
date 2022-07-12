package com.bosonit.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String ciudad;
    private int edad;

    public Persona(String nombre, String ciudad, int edad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }
    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public Persona devolverPersonaVieja(Persona persona){
        Persona personaVieja = new Persona(persona.getNombre(), persona.getCiudad(), persona.getEdad() + 1 );
        return personaVieja;
    }

    public List<Persona> listPersonasPrueba() {
        Persona persona1 = new Persona("Emar", "Burgos", 37);
        Persona persona2 = new Persona("Emaro" , "Madrid", 30);
        List<Persona> lista = new ArrayList<>();
        lista.add(persona1);
        lista.add(persona2);
        return lista;
    }
}


