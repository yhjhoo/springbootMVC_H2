package me.prince;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    PersonRepository personRepository;

    @InjectMocks
    PersonService personService;

    @Test
    void findAll() {
        when(personRepository.findAll()).thenReturn(List.of(new Person("Spring", "Boot"), new Person("hua", "Boot")));

        List<Person> all = personService.findAll();
        assertThat(all).hasSize(2);
    }
}