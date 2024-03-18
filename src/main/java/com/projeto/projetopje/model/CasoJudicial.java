package com.projeto.projetopje.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CasoJudicial {


    private Long id;
    private String descricaoProcesso;
    private Integer numero ;


    public CasoJudicial(Long id, String descricaoProcesso, Integer numero) {
        this.id = id;
        this.descricaoProcesso = descricaoProcesso;
        this.numero = numero;
    }


}