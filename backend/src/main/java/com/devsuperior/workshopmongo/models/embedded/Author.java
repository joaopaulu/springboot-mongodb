package com.devsuperior.workshopmongo.models.embedded;

import com.devsuperior.workshopmongo.models.entities.User;

import java.io.Serializable;

public class Author implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public Author() {
    }

    public Author(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
