package com.ghuertar.jugadores.dto.inputs;

public record PlayerRegistrationDTO(
        boolean willAttend,
        boolean hasPaid,
        String receiptUrl,
        boolean onBench
) {
}
