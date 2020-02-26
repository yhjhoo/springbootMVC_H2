package me.prince;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
@AllArgsConstructor
public class PersonController {
    private PersonRepository personRepository;

    @GetMapping("/all")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable Long id) {
        return personRepository.getOne(id);
    }

}