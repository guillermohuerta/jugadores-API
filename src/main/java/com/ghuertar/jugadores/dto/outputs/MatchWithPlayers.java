package com.ghuertar.jugadores.dto.outputs;

import com.ghuertar.jugadores.model.Match;

import java.util.List;

public record MatchWithPlayers(
        Match match,
        List<PlayerWithRegistrationDTO> playerWithRegistrationDTOS
) {
}
