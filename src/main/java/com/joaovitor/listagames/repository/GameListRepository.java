package com.joaovitor.listagames.repository;

import com.joaovitor.listagames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_pertence SET posicao = :novaPosicao WHERE lista_id = :listaId AND game_id = :gameId")
    void updatePertencePosicao(Long listaId, Long gameId, Integer novaPosicao);
}
