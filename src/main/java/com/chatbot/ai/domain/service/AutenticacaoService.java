package com.chatbot.ai.domain.service;

import com.chatbot.ai.domain.exception.UsuarioNaoEncontradoException;
import com.chatbot.ai.domain.model.Usuario;
import com.chatbot.ai.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email)  {
        System.out.println("chega aqui " + email);
        Usuario usuario = usuarioRepository.findByEmail(email);
        System.out.println("userdety " +  usuario);

        if (usuario == null) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado");
        } else {
            return usuario;
        }

    }
}
