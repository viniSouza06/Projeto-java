package br.com.crud.mineracao.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "TB_FUNCIONARIO")
@Data
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String email;


}
