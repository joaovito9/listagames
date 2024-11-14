package com.joaovitor.listagames.controller;

import com.joaovitor.listagames.dto.GameListDTO;
import com.joaovitor.listagames.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/gameList")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping(value = "/listarTodos")
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
}
