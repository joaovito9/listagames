package com.joaovitor.listagames.controller;

import com.joaovitor.listagames.dto.GameDTO;
import com.joaovitor.listagames.dto.GameMinDTO;
import com.joaovitor.listagames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/listar")
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/buscarPorId/{gameId}")
    public GameDTO findById(@PathVariable Long gameId) {
        return gameService.findById(gameId);
    }
}
