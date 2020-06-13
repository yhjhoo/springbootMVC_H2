package me.prince;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class JpaBootApplicationTests {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void contextLoads() {
        List<Person> movie = personRepository.findByInterestedTopicListTopicNameIn(Arrays.asList("Movie"));
        System.out.println("hello");
        System.out.println(movie.size());

    }

}
