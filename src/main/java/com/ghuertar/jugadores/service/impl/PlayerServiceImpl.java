package com.ghuertar.jugadores.service.impl;

import com.ghuertar.jugadores.dto.PlayerDTO;
import com.ghuertar.jugadores.model.Player;
import com.ghuertar.jugadores.repository.PlayerRepository;
import com.ghuertar.jugadores.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Override
    public Player createPlayer(PlayerDTO playerDTO) {

        Player player = Player.builder()
                .name(playerDTO.name())
                .lastName(playerDTO.lastName())
                .email(playerDTO.email())
                .password(playerDTO.password())
                .willAttend(playerDTO.willAttend())
                .registrationDateTime(LocalDateTime.now())
                .build();

        playerRepository.save(player);

        return player;
    }

    @Override
    public Player getPlayer(Long id) {
        return playerRepository.findById(id)
                .orElse(new Player());
        /*return playerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Player not found with id: " + id));*/
    }
}
