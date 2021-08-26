package br.com.acrf.personapi.service;

import br.com.acrf.personapi.dto.request.PersonDTO;
import br.com.acrf.personapi.dto.response.MessageResponseDTO;
import br.com.acrf.personapi.entity.Person;
import br.com.acrf.personapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static br.com.acrf.personapi.utils.PersonUtils.createFakeDTO;
import static br.com.acrf.personapi.utils.PersonUtils.createFakeEntity;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage(){
        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

    }


}
