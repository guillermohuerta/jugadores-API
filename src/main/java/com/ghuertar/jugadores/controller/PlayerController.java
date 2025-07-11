package com.ghuertar.jugadores.controller;

import com.ghuertar.jugadores.dto.inputs.PlayerDTO;
import com.ghuertar.jugadores.model.Player;
import com.ghuertar.jugadores.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/players")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody PlayerDTO playerDTO) {
        Player createdPlayer = playerService.createPlayer(playerDTO);
        return ResponseEntity.ok(createdPlayer);
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<Player> getPlayer(@PathVariable Long playerId) {
        Player getPlayer = playerService.getPlayer(playerId);
        return ResponseEntity.ok(getPlayer);
    }
}
