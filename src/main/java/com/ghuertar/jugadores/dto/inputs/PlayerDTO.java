package com.ghuertar.jugadores.dto.inputs;

public record PlayerDTO(
        String name,
        String lastName,
        String email,
        String password
) {
}
