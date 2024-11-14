package com.joaovitor.listagames.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_pertence")
public class Pertence {

    @EmbeddedId
    private PertencePK id = new PertencePK();

    private Long posicao;
}
