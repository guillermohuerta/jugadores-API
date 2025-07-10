package com.ghuertar.jugadores.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PlayerRegistration {

    @EmbeddedId
    private PlayerRegistrationId id;

    @ManyToOne
    @MapsId("matchId")
    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "player_id")
    private Player player;

    @Column(nullable = false)
    private boolean willAttend;

    @Column(nullable = false)
    private boolean hasPaid;

    private String receiptUrl;

    @Column(nullable = false)
    private boolean onBench;

    @Column(nullable = false)
    private LocalDateTime registrationDateTime;
}
