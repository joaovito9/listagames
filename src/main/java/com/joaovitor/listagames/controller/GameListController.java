package com.joaovitor.listagames.controller;

import com.joaovitor.listagames.dto.GameListDTO;
import com.joaovitor.listagames.dto.GameMinDTO;
import com.joaovitor.listagames.dto.PosicaoMovimentacaoDTO;
import com.joaovitor.listagames.service.GameListService;
import com.joaovitor.listagames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/buscarPorCategoria/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {

        return gameService.findByList(listId);
    }

    @PostMapping(value = "/moverGames/{listId}/games")
    public void mover(@PathVariable Long listId, @RequestBody PosicaoMovimentacaoDTO posicoes) {

        gameListService.mover(listId, posicoes.getPosicaoOrigem(), posicoes.getPosicaoDestino());
    }
}
