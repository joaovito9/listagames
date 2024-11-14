package com.joaovitor.listagames.dto;

import com.joaovitor.listagames.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class GameListDTO {

    private Long id;

    private String nome;

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
