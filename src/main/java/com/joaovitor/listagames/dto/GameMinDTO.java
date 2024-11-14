package com.joaovitor.listagames.dto;

import com.joaovitor.listagames.entities.Game;
import lombok.Getter;

@Getter
public class GameMinDTO {

    private Long id;

    private String titulo;

    private Integer ano;

    private String imgUrl;

    private String descrisaoCurta;

    public GameMinDTO() {
    }
    
    public GameMinDTO(Game entity){
        id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
        imgUrl = entity.getImgUrl();
        descrisaoCurta = entity.getDescrisaoCurta();
    }
}