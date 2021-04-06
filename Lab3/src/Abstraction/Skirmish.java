package Abstraction;


import Persons.Person;

public class Skirmish extends Person {
    public Skirmish(String name) {
        super(name);
    }
    public void started() {
        System.out.print(" Началась "+getName()+".");
    }
}
