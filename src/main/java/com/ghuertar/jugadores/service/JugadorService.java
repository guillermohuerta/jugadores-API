package com.ghuertar.jugadores.service;

import com.ghuertar.jugadores.dto.JugadorDTO;
import com.ghuertar.jugadores.entity.Jugador;

import java.util.List;

public interface JugadorService {

    List<Jugador> listar();

    Jugador guardar(JugadorDTO dto);

    Jugador actualizar(Long id, JugadorDTO dto);

    void eliminar(Long id);

}
