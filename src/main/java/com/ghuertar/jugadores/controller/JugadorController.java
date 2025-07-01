package com.ghuertar.jugadores.controller;


import com.ghuertar.jugadores.dto.JugadorDTO;
import com.ghuertar.jugadores.entity.Jugador;
import com.ghuertar.jugadores.service.JugadorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;  

@RestController
@RequestMapping("/api/jugadores")
@Tag(name = "Jugadores", description = "CRUD de jugadores")
public class JugadorController {

    @Autowired
    private JugadorService service;

    @GetMapping
    public List<Jugador> listar() {
        return service.listar();
    }

    @PostMapping
    public Jugador crear(@Valid @RequestBody JugadorDTO dto) {
        return service.guardar(dto);
    }

    @PutMapping("/{id}")
    public Jugador actualizar(@PathVariable Long id, @Valid @RequestBody JugadorDTO dto) {
        return service.actualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
