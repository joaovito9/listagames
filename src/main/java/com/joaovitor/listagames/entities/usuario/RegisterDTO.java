package com.joaovitor.listagames.entities.usuario;

public record RegisterDTO(String login, String password, UsuarioRole role) {
}
