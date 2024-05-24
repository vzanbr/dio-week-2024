package br.com.santanderdevweek2024.service;

import br.com.santanderdevweek2024.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User findById(long id);

    List<User> findAll();

    User create(User userToCreate);
}
