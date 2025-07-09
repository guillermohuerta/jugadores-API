package com.ghuertar.jugadores.service.impl;

import com.ghuertar.jugadores.dto.MatchDTO;
import com.ghuertar.jugadores.model.Match;
import com.ghuertar.jugadores.repository.MatchRepository;
import com.ghuertar.jugadores.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    @Override
    public Match createMatch(MatchDTO matchDTO) {

        Match match = Match.builder()
                .date(LocalDate.now())
                .hour(LocalTime.now())
                .playersPerTeam(matchDTO.playersPerTeam())
                .maxPlayersInMatch(matchDTO.maxPlayersInMatch())
                .stadium(matchDTO.stadium())
                .costPerPlayer(matchDTO.costPerPlayer())
                .totalCost(matchDTO.totalCost())
                .build();

        matchRepository.save(match);

        return match;
    }

    @Override
    public Match getMatch(Long id) {
        return matchRepository.findById(id)
                .orElse(new Match());
    }
}
