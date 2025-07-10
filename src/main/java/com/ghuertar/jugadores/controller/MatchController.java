package com.ghuertar.jugadores.controller;

import com.ghuertar.jugadores.dto.MatchDTO;
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
    public ResponseEntity<Match> getMatchPlayers(@PathVariable Long matchId) {
        Match getMatch = matchService.getMatchPlayers(matchId);
        return ResponseEntity.ok(getMatch);
    }
}
