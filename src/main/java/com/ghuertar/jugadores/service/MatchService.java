package com.ghuertar.jugadores.service;

import com.ghuertar.jugadores.dto.MatchDTO;
import com.ghuertar.jugadores.model.Match;

public interface MatchService {

    Match createMatch(MatchDTO matchDTO);

    Match getMatch(Long id);
}
