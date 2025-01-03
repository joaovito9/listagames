package com.joaovitor.listagames.service;

import com.joaovitor.listagames.dto.GameListDTO;
import com.joaovitor.listagames.entities.GameList;
import com.joaovitor.listagames.projections.GameMinProjection;
import com.joaovitor.listagames.repository.GameListRepository;
import com.joaovitor.listagames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> listaGames = gameListRepository.findAll();

        return  listaGames.stream().map(GameListDTO::new).toList();
    }

    @Transactional
    public void mover(Long listaId, int posicaoOrigem, int posicaoDestino) {
        List<GameMinProjection> lista = gameRepository.searchByList(listaId);

        GameMinProjection objeto = lista.remove(posicaoOrigem);
        lista.add(posicaoDestino, objeto);

        int minimo = posicaoOrigem < posicaoDestino ? posicaoOrigem : posicaoDestino;
        int maximo = posicaoOrigem < posicaoDestino ? posicaoDestino : posicaoOrigem;

        for(int i = minimo; i <= maximo; i++) {
            gameListRepository.updatePertencePosicao(listaId, lista.get(i).getId(), i);
        }
    }
}
