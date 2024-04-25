package br.com.treinaweb.springasync.core.repositories;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.treinaweb.springasync.core.models.User;

@Repository
public class FakeUserRepository implements UserRepository {

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(UUID.randomUUID());
        }

        return user;
    }
    
}
