package br.com.acrf.personapi.controller;

import br.com.acrf.personapi.dto.MessageResponseDTO;
import br.com.acrf.personapi.entity.Person;
import br.com.acrf.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody Person person) {
        return personService.create(person);
    }

}
