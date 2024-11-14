package com.joaovitor.listagames.controller;

import com.joaovitor.listagames.dto.GameListDTO;
import com.joaovitor.listagames.dto.GameMinDTO;
import com.joaovitor.listagames.service.GameListService;
import com.joaovitor.listagames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/gameList")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping(value = "/listarTodos")
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/buscarPorId/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {

        return gameService.findByList(listId);
    }
}
