package com.fastcampus.javaallinone.project3.mycontact.service;


import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {
    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepository personRepository;



    @Test
    void getPerson() {
        Person person = personService.getPerson(3L);

        assertThat(person.getName()).isEqualTo("dennis");


    }


    @Test
    void getPeopleByName() {

        List<Person> result = personService.getPeopleByName("martin");

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0).getName()).isEqualTo("martin");


    }


//    private void givenPeople() {
//        givenPerson("martin", 10, "A");
//        givenPerson("david", 9, "B");
//        givenPerson("demis", 7, "AB");
//        givenBlockPerson("martin", 11, "O");
//    }
//
//    private void givenPerson(String name, int age, String bloodType) {
//        personRepository.save(new Person(name, age, bloodType));
//    }

//
//    private void givenBlockPerson(String name, int age, String bloodType) {
//        Person blockPerson = new Person(name, age, bloodType);
//        blockPerson.setBlock(givenBlock(name));
//
//        personRepository.save(blockPerson);
//    }

}