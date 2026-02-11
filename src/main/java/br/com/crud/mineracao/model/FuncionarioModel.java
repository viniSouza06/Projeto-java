package br.com.crud.mineracao.model;

import jakarta.persistence.*;


@Entity
@Table(name = "TB_FUNCIONARIO")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;


    public FuncionarioModel() {}

    public FuncionarioModel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public long getId(){
        return this.id;
    }


}
