package com.joaovitor.listagames.repository;

import com.joaovitor.listagames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
