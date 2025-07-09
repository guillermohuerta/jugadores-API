package com.ghuertar.jugadores.controller;

import com.ghuertar.jugadores.dto.PlayerRegistrationDTO;
import com.ghuertar.jugadores.model.Match;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/match-player-registrations")
@RequiredArgsConstructor
public class MatchPlayerRegistrationController {

    @PostMapping("/matches/{id}/players")
    ResponseEntity<Match> registerPlayerToMatch(@RequestBody PlayerRegistrationDTO playerRegistrationDTO, @PathVariable Long id){

        return ResponseEntity.ok(Match.builder().build());
    }

}
