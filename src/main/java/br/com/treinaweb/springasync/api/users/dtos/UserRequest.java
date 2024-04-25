package br.com.treinaweb.springasync.api.users.dtos;

import br.com.treinaweb.springasync.core.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String name;

    private String email;

    private String password;

    public User toModel() {
        return User.builder()
            .name(name)
            .email(email)
            .password(password)
            .build();
    }
    
}
