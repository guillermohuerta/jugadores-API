package com.ghuertar.jugadores.dto;

import java.time.LocalDateTime;

public record PlayerRegistrationDTO(
        boolean willAttend,
        boolean hasPaid,
        String receiptUrl,
        boolean onBench
) {
}
