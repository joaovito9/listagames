package com.joaovitor.listagames.controller;

import com.joaovitor.listagames.dto.GameMinDTO;
import com.joaovitor.listagames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    @RequestMapping(value = "/listar")
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}
