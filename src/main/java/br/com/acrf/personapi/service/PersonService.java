package br.com.acrf.personapi.service;

import br.com.acrf.personapi.dto.MessageResponseDTO;
import br.com.acrf.personapi.entity.Person;
import br.com.acrf.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public MessageResponseDTO create(Person person){
        Person savePerson = personRepository.save(person);

        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savePerson.getId())
                .build();
    }
}
