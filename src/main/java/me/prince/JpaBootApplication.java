package me.prince;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaBootApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner demo(PersonRepository repo) {
        return args -> {
            repo.save(new Person("f1", "l2"));

            repo.save(new Person("f1", "l2"));

            repo.save(new Person("f1", "l2"));

            repo.save(new Person("f1", "l2"));
        };
    }*/
}
