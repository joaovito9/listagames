package com.joaovitor.listagames.repository.usuario;

import com.joaovitor.listagames.entities.usuario.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository <Usuarios, Long> {
    UserDetails findByLogin(String login);
}
