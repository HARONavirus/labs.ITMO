package Persons;

public class Robbers extends Person {
    public Robbers(String name) {
        super(name);
    }
    public void denied(boolean police){
        if(police){
            System.out.print("Доставленные в полицейское управление "+getName()+"\nотрицали свою вину, ");
        }
        else{
            System.out.print("Доставленные в милицейское управление "+getName()+"\nотрицали свою вину, ");
        }
    }

}