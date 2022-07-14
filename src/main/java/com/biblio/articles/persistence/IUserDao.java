package com.biblio.articles.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
