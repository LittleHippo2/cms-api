package com.songhaozhi.mayday.service;

import com.songhaozhi.mayday.model.dto.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersonList(String orgId, Integer startIndex, Integer endIndex);
}
