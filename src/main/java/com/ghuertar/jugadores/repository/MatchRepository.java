package com.ghuertar.jugadores.repository;

import com.ghuertar.jugadores.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
