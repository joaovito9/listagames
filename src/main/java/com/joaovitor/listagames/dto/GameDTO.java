package com.joaovitor.listagames.dto;

import com.joaovitor.listagames.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class GameDTO {

    private Long id;

    private String titulo;

    private Integer ano;

    private String genero;

    private String plataforma;

    private Double score;

    private String imgUrl;

    private String descrisaoCurta;

    private String descrisaoLonga;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
