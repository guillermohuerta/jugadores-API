package com.ghuertar.jugadores.service.impl;

import com.ghuertar.jugadores.dto.inputs.PlayerRegistrationDTO;
import com.ghuertar.jugadores.model.Match;
import com.ghuertar.jugadores.model.Player;
import com.ghuertar.jugadores.model.PlayerRegistration;
import com.ghuertar.jugadores.model.PlayerRegistrationId;
import com.ghuertar.jugadores.repository.PlayerRegistrationRepository;
import com.ghuertar.jugadores.service.PlayerRegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class PlayerRegistrationServiceImpl implements PlayerRegistrationService {

    private final PlayerRegistrationRepository playerRegistrationRepository;

    @Override
    public PlayerRegistration registerPlayerToMatch(Long matchId, Long playerId, PlayerRegistrationDTO playerRegistrationDTO) {

        PlayerRegistrationId playerRegistrationId = new PlayerRegistrationId();
        playerRegistrationId.setMatchId(matchId);
        playerRegistrationId.setPlayerId(playerId);

        PlayerRegistration playerRegistration = PlayerRegistration.builder()
                .id(playerRegistrationId)
                .player(Player.builder().id(playerId).build())
                .match(Match.builder().id(matchId).build())
                .willAttend(playerRegistrationDTO.willAttend())
                .hasPaid(playerRegistrationDTO.hasPaid())
                .receiptUrl(playerRegistrationDTO.receiptUrl())
                .onBench(playerRegistrationDTO.onBench())
                .registrationDateTime(LocalDateTime.now())
                .build();

        playerRegistrationRepository.save(playerRegistration);

        return playerRegistration;
    }
}
