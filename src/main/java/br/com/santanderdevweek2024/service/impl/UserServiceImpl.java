package br.com.santanderdevweek2024.service.impl;

import br.com.santanderdevweek2024.domain.model.User;
import br.com.santanderdevweek2024.repository.UserRepository;
import br.com.santanderdevweek2024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User userToCreate) {
//        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
//            throw new IllegalArgumentException("This Account number already exists.");
//        }
        return userRepository.save(userToCreate);
    }
}


//@Override
//public User create(User userToCreate) {
//    if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
//        throw new IllegalArgumentException("This User ID already exists.");
//    }
//    return null;
//}