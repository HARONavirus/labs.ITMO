package Persons;

public class Police extends Person {
    public Police(String name) {
        super(name);
    }
    public void used(boolean armored) {
        if (armored) {
            System.out.print(" но " + getName() + " пустила в ход бронированные автомобили, вооружённые пулемутами. ");
        }
        else{
            System.out.print(" но " + getName() + " пустила в ход обычные автомобили, вооруженные мигалками. ");
        }
    }
}
