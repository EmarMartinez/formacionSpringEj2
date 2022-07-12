package com.bosonit.Ejercicio2;

import org.springframework.web.bind.annotation.*;

@RestController
public class DevolverMasViejo {

    @RequestMapping(value = "/name", method= RequestMethod.POST )
    @ResponseBody
    public Persona EdadMasUno(@RequestBody Persona persona) {


        return persona.devolverPersonaVieja(persona);


    }
}
