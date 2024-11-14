package com.joaovitor.listagames.projections;

public interface GameMinProjection {

    Long getId();
    String getTitulo();
    Integer getAno();
    String getImgUrl();
    String getDescrisaoCurta();
    Integer getPosicao();
}
