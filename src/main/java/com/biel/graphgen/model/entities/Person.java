package com.biel.graphgen.model.entities;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;
import java.util.List;

/**
 * Created by Biel on 16/12/2016.
 */
@NodeEntity
public class Person {
    @GraphId Long id;
    String name;
    String lastNames;
    Date birthDate;


    @Relationship(direction = Relationship.UNDIRECTED)
    List<Person> friends;




}
