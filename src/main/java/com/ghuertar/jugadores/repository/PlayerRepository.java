package com.ghuertar.jugadores.repository;

import com.ghuertar.jugadores.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
