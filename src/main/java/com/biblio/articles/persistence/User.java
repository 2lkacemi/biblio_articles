package com.biblio.articles.persistence;

import lombok.*;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USER_TBL")
public class User {
    @Id
    private int id;
    private String userName;
    private String password;
    private String email;
}
