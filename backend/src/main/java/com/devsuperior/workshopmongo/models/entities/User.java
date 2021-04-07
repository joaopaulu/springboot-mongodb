package com.devsuperior.workshopmongo.models.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collation = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;

    @DBRef(lazy = true)
    public List<Post> posts = new ArrayList<>();

    public User(){}

    public User(String id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
