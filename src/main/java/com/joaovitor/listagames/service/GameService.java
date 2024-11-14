package com.joaovitor.listagames.service;

import com.joaovitor.listagames.dto.GameMinDTO;
import com.joaovitor.listagames.entities.Game;
import com.joaovitor.listagames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> resultado = gameRepository.findAll();
        return resultado.stream().map(GameMinDTO::new).toList();

        /* Feito com FOR + adicionar os Setters no GameMinDTO.
        List<GameMinDTO> resultadoDTO = new ArrayList<>();
        for (Game game : resultado) {
            GameMinDTO gameMinDTO = new GameMinDTO();
            gameMinDTO.setId(game.getId());
            gameMinDTO.setTitulo(game.getTitulo());
            gameMinDTO.setAno(game.getAno());
            gameMinDTO.setImgUrl(game.getImgUrl());
            gameMinDTO.setDescrisaoCurta(game.getDescrisaoCurta());
            resultadoDTO.add(gameMinDTO);
        }
        return resultadoDTO; */
    }
}
