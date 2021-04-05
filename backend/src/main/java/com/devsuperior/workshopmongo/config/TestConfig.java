package com.devsuperior.workshopmongo.config;

import com.devsuperior.workshopmongo.models.entities.User;
import com.devsuperior.workshopmongo.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private UserRepositories userRepositories;

    @PostConstruct
    public void init(){
        userRepositories.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User joao = new User(null, "João", "joao@gmail.com");
        User jonh = new User(null, "Jonh Dude", "john@gmail.com");

        userRepositories.saveAll(Arrays.asList(maria,joao,jonh));
    }
}
