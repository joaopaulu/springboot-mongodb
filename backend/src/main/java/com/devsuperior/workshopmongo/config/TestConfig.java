package com.devsuperior.workshopmongo.config;

import com.devsuperior.workshopmongo.models.entities.User;
import com.devsuperior.workshopmongo.repositories.PostRepository;
import com.devsuperior.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @PostConstruct
    public void init(){
        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User joao = new User(null, "João", "joao@gmail.com");
        User jonh = new User(null, "Jonh Dude", "john@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,joao,jonh));
    }
}
