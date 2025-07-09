package com.ghuertar.jugadores.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "players")
public class Player {

    //Login Attribute
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    //@OneToMany(mappedBy = "user")
    //private List<Token> tokens;

    //Match Attribute
    @Column(nullable = false)
    private boolean willAttend;

    private boolean hasPaid;

    private String receiptUrl; // imagen en sistema de archivos o base64

    private boolean onBench;

    @Column(nullable = false)
    private LocalDateTime registrationDateTime;

    /*@ManyToMany(mappedBy = "registeredPlayers")
    private Set<Match> registeredPlayers;*/

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlayerRegistration> inscripciones = new HashSet<>();
}
