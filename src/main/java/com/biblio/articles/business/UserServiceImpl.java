package com.biblio.articles.business;


import com.biblio.articles.persistence.IUserDao;
import com.biblio.articles.persistence.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    final private IUserDao iUserDao;

    @Autowired
    public UserServiceImpl(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    /**
     * add user
     */
    @Override
    public User addUser(User user) {
        return iUserDao.save(user);
    }

    /**
     * get user using email
     * @param email parameter
     * @return a user if it exists
     */
    @Override
    public User getUserByEmail(String email) {
        User user = iUserDao.findByEmail(email);
        return user;
    }



}
