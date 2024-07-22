package com.company.nomeprojeto.tarefas.dto;

public class TarefaDTO {
    private int id;
    private String titulo;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int proximoId) {
        this.id = proximoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
}
