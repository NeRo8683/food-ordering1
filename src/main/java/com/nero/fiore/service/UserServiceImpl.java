package com.nero.fiore.service;

import com.nero.fiore.config.JwtProvider;
import com.nero.fiore.model.User;
import com.nero.fiore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
    String email = jwtProvider.getEmailFromJwtToken(jwt);
    User user = findUserByEmail(email);
    return user;
    }

    @Override
    public User findUserByEmail(String email) throws Exception {

        User user = findUserByEmail(email);
        if (user==null){
            throw new Exception("user not found");
        }
        return user;
    }
}
