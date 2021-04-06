package Objects;


import Persons.Person;

public class Cars extends Person {
    public Cars(String name) {
        super(name);
    }

    public static void joined(String name, int count) {
            if (count > 1) {
                System.out.print(" так ещё "+count+" "+name+"ы, нагруженные полицейскими, включились в преследование.");
            } else {
                System.out.print(" так ещё "+count+" "+name+"а, нагруженные полицейскими, включились в преследование.");
            }

    }
    public void wasSearched(boolean carefully) {
        if(carefully){
            System.out.print(getName()+"а была тщательно обыскана, ");
        }
        else{
            System.out.print(getName()+"а была добротно обыскана, ");
        }

    }
}
