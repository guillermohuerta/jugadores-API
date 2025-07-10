package com.ghuertar.jugadores.service;

import com.ghuertar.jugadores.dto.PlayerRegistrationDTO;
import com.ghuertar.jugadores.model.PlayerRegistration;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PlayerRegistrationService {

    PlayerRegistration registerPlayerToMatch(Long matchId, Long playerId, PlayerRegistrationDTO playerRegistrationDTO);

    List<PlayerRegistration> getPlayersToMatches();

}
