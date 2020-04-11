package me.prince;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PersonController.class)
class PersonControllerTest {
    @MockBean
    private PersonService personService;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    void setup() {
        Person person = new Person(1L, "Yang", "Huajie");
        when(personService.findAll())
                .thenReturn(Arrays.asList(person));

        when(personService.getOne(1L)).thenReturn(person);
    }

    @Test
    void controllerTest() throws Exception {
        mvc.perform(get("/person/all")).andExpect(status().isOk())
                .andExpect(
                        content().json("[\n" +
                                "  {\n" +
                                "    \"id\": 1,\n" +
                                "    \"firstName\": \"Yang\",\n" +
                                "    \"lastName\": \"Huajie\"\n" +
                                "  }\n" +
                                "]")
                );

    }

    @Test
    void shouldGetPersonById() throws Exception {
        mvc.perform(get("/person/1"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"firstName\": \"Yang\",\n" +
                        "  \"lastName\": \"Huajie\"\n" +
                        "}"));
    }
}