package com.ghuertar.jugadores.repository;

import com.ghuertar.jugadores.dto.outputs.PlayerWithRegistrationDTO;
import com.ghuertar.jugadores.model.Player;
import com.ghuertar.jugadores.model.PlayerRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRegistrationRepository extends JpaRepository<PlayerRegistration, Long> {

    @Query("SELECT new com.ghuertar.jugadores.dto.outputs.PlayerWithRegistrationDTO(pr.player, pr) " +
            "FROM PlayerRegistration pr " +
            "WHERE pr.match.id = :matchId")
    List<PlayerWithRegistrationDTO> findPlayersWithRegistrationByMatchId(@Param("matchId") Long matchId);

}
