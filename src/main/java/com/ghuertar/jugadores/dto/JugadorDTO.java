package com.ghuertar.jugadores.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record JugadorDTO(
        Long id,

        @NotBlank(message = "El nombre es obligatorio")
        String nombre,

        @Min(15) @Max(50)
        int edad,

        @NotBlank(message = "La posición es obligatoria")
        String posicion
) {}