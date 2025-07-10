package com.ghuertar.jugadores.controller;

import com.ghuertar.jugadores.dto.PlayerRegistrationDTO;
import com.ghuertar.jugadores.model.PlayerRegistration;
import com.ghuertar.jugadores.service.PlayerRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/match-player-registrations")
@RequiredArgsConstructor
public class MatchPlayerRegistrationController {

    private final PlayerRegistrationService playerRegistrationService;

    @PostMapping("/matches/{matchId}/players/{playerId}")
    ResponseEntity<PlayerRegistration> registerPlayerToMatch(@PathVariable Long matchId, @PathVariable Long playerId,
                                                             @RequestBody PlayerRegistrationDTO playerRegistrationDTO) {

        PlayerRegistration playerRegistration = playerRegistrationService.registerPlayerToMatch(matchId, playerId, playerRegistrationDTO);

        return ResponseEntity.ok(playerRegistration);
    }

}
