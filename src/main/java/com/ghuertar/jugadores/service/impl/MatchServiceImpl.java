package com.ghuertar.jugadores.service.impl;

import com.ghuertar.jugadores.dto.MatchDTO;
import com.ghuertar.jugadores.model.Match;
import com.ghuertar.jugadores.model.Player;
import com.ghuertar.jugadores.repository.MatchRepository;
import com.ghuertar.jugadores.repository.PlayerRegistrationRepository;
import com.ghuertar.jugadores.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    private final PlayerRegistrationRepository playerRegistrationRepository;

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
    public Match getMatch(Long matchId) {
        return matchRepository.findById(matchId)
                .orElse(new Match());
    }

    @Override
    public Match getMatchPlayers(Long matchId) {
        List<Player> playersByMatchId = playerRegistrationRepository.findPlayersByMatchId(matchId);

        Match match = Match.builder()
                .id(matchId)
                .players(playersByMatchId).build();

        return match;
    }
}
