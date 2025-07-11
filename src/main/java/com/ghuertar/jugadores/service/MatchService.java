package com.ghuertar.jugadores.service;

import com.ghuertar.jugadores.dto.inputs.MatchDTO;
import com.ghuertar.jugadores.dto.outputs.MatchWithPlayers;
import com.ghuertar.jugadores.model.Match;

public interface MatchService {

    Match createMatch(MatchDTO matchDTO);

    Match getMatch(Long matchId);

    MatchWithPlayers getMatchPlayers(Long matchId);
}
