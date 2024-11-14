package com.joaovitor.listagames.repository;

import com.joaovitor.listagames.entities.Game;
import com.joaovitor.listagames.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.titulo, tb_game.ano, tb_game.img_url AS imgUrl,
		tb_game.descrisao_curta, tb_pertence.posicao
		FROM tb_game
		INNER JOIN tb_pertence ON tb_game.id = tb_pertence.game_id
		WHERE tb_pertence.lista_id = :listId
		ORDER BY tb_pertence.posicao
			""")
    List<GameMinProjection> searchByList(Long listId);
}
