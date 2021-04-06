package Objects;


import Persons.Person;

public class Suitcase extends Person {
    public Suitcase(String name) {
        super(name);
    }
    public void wasGone(){
        System.out.print("но "+getName()+" с деньгами исчез, словно растаял в воздухе. ");
    }
    @Override
    public String toString() {
        return "Чемодан";
    }

}