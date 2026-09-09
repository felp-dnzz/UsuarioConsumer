package model;

import java.time.LocalDate;

public class UsuarioInfo {
    private Integer usuarioid;
    private String nome;
    private String email;
    private LocalDate datanascimento;

    public UsuarioInfo(){}

    public UsuarioInfo(Integer usuarioid, String nome, String email, LocalDate datanascimento){
        this.setUsuarioid(usuarioid);
        this.setNome(nome);
        this.setEmail(email);
        this.setDatanascimento(datanascimento);
    }

    public Integer getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Integer usuarioid) {
        this.usuarioid = usuarioid;
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

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }
}
