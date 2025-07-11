package com.ghuertar.jugadores.service.impl;

import com.ghuertar.jugadores.dto.inputs.MatchDTO;
import com.ghuertar.jugadores.dto.outputs.MatchWithPlayers;
import com.ghuertar.jugadores.dto.outputs.PlayerWithRegistrationDTO;
import com.ghuertar.jugadores.model.Match;
import com.ghuertar.jugadores.repository.MatchRepository;
import com.ghuertar.jugadores.repository.PlayerRegistrationRepository;
import com.ghuertar.jugadores.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

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
    public MatchWithPlayers getMatchPlayers(Long matchId) {

        Optional<Match> match = matchRepository.findById(matchId);

        List<PlayerWithRegistrationDTO> playersWithRegistrationsByMatchId = playerRegistrationRepository.findPlayersWithRegistrationByMatchId(matchId);

        return new MatchWithPlayers(match.get(), playersWithRegistrationsByMatchId);
    }
}
