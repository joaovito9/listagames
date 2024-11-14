package com.joaovitor.listagames.service;

import com.joaovitor.listagames.dto.GameDTO;
import com.joaovitor.listagames.dto.GameMinDTO;
import com.joaovitor.listagames.entities.Game;
import com.joaovitor.listagames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> resultado = gameRepository.findAll();

        return resultado.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
        Game resultado = gameRepository.findById(gameId).get();

        //TODO: Fazer o tratamento de exceção caso o game não seja encontrado.
        return new GameDTO(resultado);
    }
}
