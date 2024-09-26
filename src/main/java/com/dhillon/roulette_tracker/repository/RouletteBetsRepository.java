package com.dhillon.roulette_tracker.repository;


import com.dhillon.roulette_tracker.model.RouletteBets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouletteBetsRepository extends JpaRepository<RouletteBets, Long> {
}
