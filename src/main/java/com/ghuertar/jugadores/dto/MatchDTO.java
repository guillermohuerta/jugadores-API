package com.ghuertar.jugadores.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record MatchDTO(
        Long id,
        LocalDate date,
        LocalTime hour,
        Integer playersPerTeam,
        Integer maxPlayersInMatch,
        String stadium,
        Double costPerPlayer,
        Double totalCost
) {
}
