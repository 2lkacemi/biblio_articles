package com.biblio.articles.business;

import com.biblio.articles.persistence.User;
import org.springframework.jdbc.datasource.init.UncategorizedScriptException;

import java.util.List;

public interface IUserService {
    User addUser(User userDto);
    User getUserByEmail(String email);
}

