package com.ghuertar.jugadores.service;

import com.ghuertar.jugadores.dto.inputs.PlayerDTO;
import com.ghuertar.jugadores.model.Player;

public interface PlayerService {
    Player createPlayer(PlayerDTO playerDTO);

    Player getPlayer(Long playerId);
}
