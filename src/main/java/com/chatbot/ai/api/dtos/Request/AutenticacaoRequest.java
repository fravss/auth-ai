package com.chatbot.ai.api.dtos.Request;


import jakarta.validation.constraints.NotNull;


public class AutenticacaoRequest {
    @NotNull
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @NotNull
    private String senha;
}
