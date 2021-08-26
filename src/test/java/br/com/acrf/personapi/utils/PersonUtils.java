package br.com.acrf.personapi.utils;

import br.com.acrf.personapi.dto.request.PersonDTO;
import br.com.acrf.personapi.entity.Person;
import org.apache.tomcat.jni.Local;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {
    private  static final String FIRST_NAME = "AUGUSTO";
    private static final String LAST_NAME = "FREIRE";
    private static final String CPF_NUMBER = "213.431.342-09";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10 , 10);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("04-04-2000")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
