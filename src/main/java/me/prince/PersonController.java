package me.prince;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Iterable<Person> getAll() {
        return personRepository.findAll();
    }
}