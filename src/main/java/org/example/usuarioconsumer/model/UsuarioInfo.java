package org.example.usuarioconsumer.model;

import java.time.LocalDate;

public class UsuarioInfo {
    private Integer usuarioId;
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public UsuarioInfo(){}

    public UsuarioInfo(Integer usuarioId, String nome, String email, LocalDate dataNascimento){
        this.usuarioId(usuarioId);
        this.nome(nome);
        this.email(email);
        this.dataNascimento(dataNascimento);
    }

    public Integer getUsuarioid() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
