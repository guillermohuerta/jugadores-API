package com.ghuertar.jugadores.repository;

import com.ghuertar.jugadores.model.Player;
import com.ghuertar.jugadores.model.PlayerRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRegistrationRepository extends JpaRepository<PlayerRegistration, Long> {

    @Query("SELECT pr.player FROM PlayerRegistration pr WHERE pr.match.id = :matchId")
    List<Player> findPlayersByMatchId(@Param("matchId") Long matchId);

}
