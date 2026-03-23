package com.queiroz.Gerenciamento_Departamentos.models;

import jakarta.persistence.*;

@Entity(name = "Departamento")
@Table(name = "tb_departamento")
public class DepartamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DPT_ID")
    private int id;
    @Column(name = "DPT_NOME")
    private String nome;
    @Column(name = "DPT_LOCALIZACAO")
    private String localizacao;

    public DepartamentoModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
