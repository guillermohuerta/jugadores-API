package com.ghuertar.jugadores.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matches")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Match {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalTime hour;

    @Column(nullable = false)
    private Integer playersPerTeam;

    @Column(nullable = false)
    private Integer maxPlayersInMatch;

    @Column(nullable = false)
    private String stadium;

    @Column(nullable = false)
    private Double costPerPlayer;

    @Column(nullable = false)
    private Double totalCost;

    @Transient
    private List<Player> players;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlayerRegistration> playerRegistrations = new HashSet<>();
}
