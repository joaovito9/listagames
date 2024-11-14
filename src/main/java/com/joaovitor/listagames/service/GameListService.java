package com.joaovitor.listagames.service;

import com.joaovitor.listagames.dto.GameListDTO;
import com.joaovitor.listagames.entities.GameList;
import com.joaovitor.listagames.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> listaGames = gameListRepository.findAll();

        return  listaGames.stream().map(GameListDTO::new).toList();
    }
}
