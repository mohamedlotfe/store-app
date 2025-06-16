package com.codewithmo.storeapp;

import com.codewithmo.storeapp.entities.User;
import com.codewithmo.storeapp.repositories.UserRepository;
import com.codewithmo.storeapp.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreAppApplication.class, args);
        var userService = context.getBean(UserService.class);

        // var user = User.builder().name("John").email("test@t.com").password("testpass").build();
        // repository.save(user);
        // repository.findAll().forEach(user1 -> System.out.println(user1.getEmail()));

        userService.showEntityStates();


    }

}
