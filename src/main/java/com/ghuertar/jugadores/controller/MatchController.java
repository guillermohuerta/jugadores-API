package com.ghuertar.jugadores.controller;

import com.ghuertar.jugadores.dto.inputs.MatchDTO;
import com.ghuertar.jugadores.dto.outputs.MatchWithPlayers;
import com.ghuertar.jugadores.model.Match;
import com.ghuertar.jugadores.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/matches")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService matchService;

    @PostMapping
    public ResponseEntity<Match> createMatch(@RequestBody MatchDTO matchDTO) {
        Match createdMatch = matchService.createMatch(matchDTO);
        return ResponseEntity.ok(createdMatch);
    }

    @GetMapping("/{matchId}")
    public ResponseEntity<Match> getMatch(@PathVariable Long matchId) {
        Match getMatch = matchService.getMatch(matchId);
        return ResponseEntity.ok(getMatch);
    }

    @GetMapping("/{matchId}/players")
    public ResponseEntity<MatchWithPlayers> getMatchPlayers(@PathVariable Long matchId) {
        MatchWithPlayers getMatchPlayers = matchService.getMatchPlayers(matchId);
        return ResponseEntity.ok(getMatchPlayers);
    }
}
