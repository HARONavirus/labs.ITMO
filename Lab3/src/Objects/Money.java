package Objects;


import Persons.Person;

public class Money extends Person {
    public Money(String name) {
        super(name);
    }
    public void thereWasNo(boolean kidnapped) {
        if(kidnapped) {
            System.out.print("но, ко всеобщему\nудивлению, у них вовсе не оказалось похищенных "+getName()+". ");
        }
        else{
            System.out.print("но, ко всеобщему\nудивлению, у них вовсе не оказалось фальшивых "+getName()+". ");
        }
    }
    @Override
    public String toString() {
        return "Деньги";
    }

}
