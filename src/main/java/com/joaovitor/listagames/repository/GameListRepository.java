package com.joaovitor.listagames.repository;

import com.joaovitor.listagames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}