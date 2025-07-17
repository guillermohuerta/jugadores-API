package com.ghuertar.jugadores.dto.outputs;

import com.ghuertar.jugadores.model.Player;

import java.time.LocalDateTime;

public record PlayerWithRegistrationDTO(
        Player player,
        boolean willAttend,
        boolean hasPaid,
        String receiptUrl,
        boolean onBench,
        LocalDateTime registrationDateTime
) {
}
