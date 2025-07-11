package com.ghuertar.jugadores.dto.outputs;

import com.ghuertar.jugadores.model.Player;
import com.ghuertar.jugadores.model.PlayerRegistration;

public record PlayerWithRegistrationDTO(
        Player player,
        PlayerRegistration playerRegistration
) {
}
