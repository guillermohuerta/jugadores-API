package com.ghuertar.jugadores.repository;

import com.ghuertar.jugadores.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {
}
