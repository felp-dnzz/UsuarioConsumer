package org.example.usuarioconsumer.model;

import java.time.LocalDate;

public class UsuarioInfo {
    private Integer usuarioId;
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public UsuarioInfo(){}

    public UsuarioInfo(Integer usuarioId, String nome, String email, LocalDate dataNascimento){
        this.setUsuarioId(usuarioId);
        this.setNome(nome);
        this.setEmail(email);
        this.setDataNascimento(dataNascimento);
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
