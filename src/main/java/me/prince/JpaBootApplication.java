package me.prince;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class JpaBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaBootApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository repo) {
        return args -> {
            repo.save(new Person("f1", "l2"));

            repo.save(new Person("f1", "l2"));

            repo.save(new Person("f1", "l2"));

            repo.save(new Person("f1", "l2"));

            repo.save(Person.builder()
                    .firstName("Yang")
                    .lastName("Yang")
                    .interestedTopicList(Arrays.asList(
                            InterestedTopic.builder().topicName("Movie").build(),
                            InterestedTopic.builder().topicName("Music").build()
                    ))
                    .build());


            repo.save(Person.builder()
                    .firstName("Hua")
                    .lastName("Hua")
                    .interestedTopicList(Arrays.asList(
                            InterestedTopic.builder().topicName("Movie").build(),
                            InterestedTopic.builder().topicName("Sports").build()
                    ))
                    .build());
        };
    }
}
