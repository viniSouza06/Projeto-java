package br.com.crud.mineracao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Entity
@Table(name = "TB_FUNCIONARIO")
public class FuncionarioModel {

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    @Pattern(regexp = "analista|minerador|gerente")
    @Column(nullable = false)
    private String cargo;






    public FuncionarioModel() {}

    public FuncionarioModel(String nome, String email,  String cargo) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
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

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public Long getId(){
        return this.id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }


}
