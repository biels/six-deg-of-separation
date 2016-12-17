package com.biel.graphgen.model.repositories;

import com.biel.graphgen.model.entities.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by Biel on 17/12/2016.
 */
public interface PersonRepository extends GraphRepository<Person>{
}
