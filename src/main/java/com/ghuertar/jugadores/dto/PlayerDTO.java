package com.ghuertar.jugadores.dto;

public record PlayerDTO(
        String name,
        String lastName,
        String email,
        String password,
        Boolean willAttend
) {
}
