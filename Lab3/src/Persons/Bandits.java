package Persons;

import Moves.MovesOnStreet;

public class Bandits extends Person implements MovesOnStreet {
    public Bandits(String name) {
        super(name);
    }

    @Override
    public void getLocation() {
        super.getLocation();
    }

    @Override
    public void setLocation(boolean location) {
        super.setLocation(location);
    }


    public void succeeded() {
        System.out.print(" " + getName() + "у, который стрелял очень\nметко, удалось вывести из строя и эти обе машины,");
    }

    public void arrested() {
        System.out.print("В конце концов " + getName() + "ы были задержаны, ");
    }
}





