package com.app.prometheus.services;


import com.app.prometheus.web.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonService {
    Optional<Person> getPersonById(int personId);

    List<Person> getAllPersons();

    boolean removePerson(int personId);

    Optional<Person> saveUpdatePerson(Person person);
}
