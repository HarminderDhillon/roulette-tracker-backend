package com.dhillon.roulette_tracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roulette_bets")
public record RouletteBets(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,

        @Column(name = "threes")
        String threes,

        @Column(name = "sixes")
        String sixes,

        @Column(name = "nines")
        String nines,

        @Column(name = "twelves_dozen")
        String twelvesDozen,

        @Column(name = "rows")
        String rows,

        @Column(name = "double_street")
        String doubleStreet,

        @Column(name = "low_high")
        String lowHigh,

        @Column(name = "red_black")
        String redBlack,

        @Column(name = "even_odd")
        String evenOdd
) {}
