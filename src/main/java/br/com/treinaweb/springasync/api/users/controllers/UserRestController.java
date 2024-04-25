package br.com.treinaweb.springasync.api.users.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.springasync.api.users.dtos.UserRequest;
import br.com.treinaweb.springasync.api.users.dtos.UserResponse;
import br.com.treinaweb.springasync.core.repositories.UserRepository;
import br.com.treinaweb.springasync.core.services.mail.MailService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserRestController {

    private final MailService mailService;
    private final UserRepository userRepository;

    @PostMapping
    public UserResponse create(@RequestBody UserRequest userRequest) {
        var user = userRequest.toModel();
        var userSaved = userRepository.save(user);
        mailService.send(
            user.getEmail(), 
            "Bem-vindo ao sistema", 
            "Seja bem-vindo ao sistema"
        );
        return UserResponse.of(userSaved);
    }
    
}
