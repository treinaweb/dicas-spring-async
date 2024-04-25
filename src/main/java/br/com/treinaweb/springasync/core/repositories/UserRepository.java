package br.com.treinaweb.springasync.core.repositories;

import br.com.treinaweb.springasync.core.models.User;

public interface UserRepository {

    User save(User user);
    
}
