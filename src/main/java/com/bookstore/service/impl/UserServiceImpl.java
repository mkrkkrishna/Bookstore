package com.bookstore.service.impl;

import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;
//import com.bookstore.repository.PasswordResetTokenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@Service
public class UserServiceImpl implements UserService{

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public PasswordResetToken getPasswordResetToken(String token) {
        return passwordResetTokenRepository.findByToken(token);
    }

    @Override
    public void createPasswordResetTokenForUser(User user, String token) {
        final PasswordResetToken myToken = new PasswordResetToken(token, user);
        passwordResetTokenRepository.save(myToken);
    }

    @Override
    User findByUserName(String userName){\
        return userRepository.findByUserName(userName);
    }


    //@Override
    User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Override
    User createUser(User user, Set<UserRole> userRoles) throws Exception{
        User localUser = userRepository.findByUsername(user.getUsername());

        if(localUser != null){
            LOG.info("user {} already exists. Nothing will be done", user.getUsername());
         } else {
            for(UserRole userRole : userRoles){
                roleRepository.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);

            localUser = userRepository.save(user);
         }
    }

    @Override
    public user save(User user){
        return userRepository.save(user);
    }

}*/
