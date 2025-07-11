package com.ghuertar.jugadores.service;

import com.ghuertar.jugadores.dto.inputs.PlayerRegistrationDTO;
import com.ghuertar.jugadores.model.PlayerRegistration;

public interface PlayerRegistrationService {

    PlayerRegistration registerPlayerToMatch(Long matchId, Long playerId, PlayerRegistrationDTO playerRegistrationDTO);

}
