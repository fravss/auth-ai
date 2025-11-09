package com.chatbot.ai.api.dtos.Response;




public class AutenticacaoResponse {
    private String token;
    public String getToken() {
        return token;
    }

    public AutenticacaoResponse(String token) {
        this.token = token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
