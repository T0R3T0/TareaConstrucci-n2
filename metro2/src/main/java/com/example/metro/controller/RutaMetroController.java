package com.example.metro.controller;

import com.example.metro.model.RutaMetro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RutaMetroController {

    @GetMapping("/rutas")
    public List<RutaMetro> listarRutas() {
        return Arrays.asList(
                new RutaMetro("Línea A", "Niquía", "La Estrella"),
                new RutaMetro("Línea B", "San Antonio", "San Javier"),
                new RutaMetro("Línea L", "Acevedo", "Santo Domingo"),
                new RutaMetro("Línea H", "Oriente", "Villa Sierra"),
                new RutaMetro("Línea J", "San Javier", "La Aurora"),
                new RutaMetro("Línea K", "Acevedo", "Santo Domingo")
        );
    }
}
