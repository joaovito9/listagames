package com.joaovitor.listagames.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private Integer ano;

    private String genero;

    private String plataforma;

    private Double score;

    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String descrisaoCurta;

    @Column(columnDefinition = "TEXT")
    private String descrisaoLonga;

//    Tudo feito com Lombok, comentario só para demonstrar.
//    Construtor sem args.
//    public Game() {
//    }
//
//    Construtor com args.
//    public Game(Long id, String titulo, Integer ano, String genero, String plataforma, Double score, String imgUrl, String descrisaoCurta, String descrisaoLonga) {
//        this.id = id;
//        this.titulo = titulo;
//        this.ano = ano;
//        this.genero = genero;
//        this.plataforma = plataforma;
//        this.score = score;
//        this.imgUrl = imgUrl;
//        this.descrisaoCurta = descrisaoCurta;
//        this.descrisaoLonga = descrisaoLonga;
//    }
//
//    Getters e Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public Integer getAno() {
//        return ano;
//    }
//
//    public void setAno(Integer ano) {
//        this.ano = ano;
//    }
//
//    public String getGenero() {
//        return genero;
//    }
//
//    public void setGenero(String genero) {
//        this.genero = genero;
//    }
//
//    public String getPlataforma() {
//        return plataforma;
//    }
//
//    public void setPlataforma(String plataforma) {
//        this.plataforma = plataforma;
//    }
//
//    public Double getScore() {
//        return score;
//    }
//
//    public void setScore(Double score) {
//        this.score = score;
//    }
//
//    public String getImgUrl() {
//        return imgUrl;
//    }
//
//    public void setImgUrl(String imgUrl) {
//        this.imgUrl = imgUrl;
//    }
//
//    public String getDescrisaoCurta() {
//        return descrisaoCurta;
//    }
//
//    public void setDescrisaoCurta(String descrisaoCurta) {
//        this.descrisaoCurta = descrisaoCurta;
//    }
//
//    public String getDescrisaoLonga() {
//        return descrisaoLonga;
//    }
//
//    public void setDescrisaoLonga(String descrisaoLonga) {
//        this.descrisaoLonga = descrisaoLonga;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Game game = (Game) o;
//        return Objects.equals(id, game.id);
//    }
}