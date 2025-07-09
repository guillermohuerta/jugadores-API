package com.ghuertar.jugadores.controller;

import com.ghuertar.jugadores.dto.PlayerDTO;
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

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayer(@PathVariable Long id) {
        Player getPlayer = playerService.getPlayer(id);
        return ResponseEntity.ok(getPlayer);
    }
}
