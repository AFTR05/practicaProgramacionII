package org.example.herencia;

import org.example.model.Costumer;

import java.util.ArrayList;

public class Examples {

    ArrayList<Person> people = new ArrayList<>();

    public void addPeople() {

        people.add(new Costumer(123,"Paula",2));
        people.add(new Costumer(456,"Cristhian",2 ));
        people.add(new Costumer(789,"John",2));
        people.add(new Costumer(147,"Sofia",2));
        people.add(new Person(258,"David"));
        people.add(new Person(369,"Samuel"));
        people.add(new Person(963,"Derly"));
        people.add(new Person(878,"Silvana"));

        for(Person person : people){
            System.out.println(person.getName());
        }
    }



}
