package com.joaovitor.listagames.controller;

import com.joaovitor.listagames.entities.usuario.AuthenticationDTO;
import com.joaovitor.listagames.entities.usuario.LoginResponseDTO;
import com.joaovitor.listagames.entities.usuario.RegisterDTO;
import com.joaovitor.listagames.entities.usuario.Usuarios;
import com.joaovitor.listagames.repository.usuario.UsuarioRepository;
import com.joaovitor.listagames.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepository repository;

    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){
        var usernamePassoword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassoword);

        var token = tokenService.generateToken((Usuarios) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping(value = "/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data){
        if(this.repository.findByLogin(data.login()) != null){
            return ResponseEntity.badRequest().build();
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        Usuarios newUsuario = new Usuarios(data.login(), encryptedPassword, data.role());

        this.repository.save(newUsuario);

        return ResponseEntity.ok().build();
    }
}
