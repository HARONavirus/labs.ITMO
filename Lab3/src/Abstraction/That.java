package Abstraction;


import Persons.Person;

public class That extends Person {
    public That(String name) {
        super(name);
    }
    public void didntHelp() {
        System.out.print(getName()+", правда, не помогло бандитам уйти от возмездия,");
    }
}
