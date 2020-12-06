package lab2;

import lab2.mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {

    public static void main(String[] args) {

        Battle b = new Battle();
        Bruxish bruxish = new Bruxish("Black", 1);
        Petilil petilil = new Petilil("White",1);
        Lilligant lilligant = new Lilligant("Red", 1);
        Happiny happiny = new Happiny("Blue", 1);
        Chansey chansey = new Chansey("Pink", 1);
        Blissey blissey = new Blissey("Green", 1);

        b.addAlly(bruxish);
        b.addAlly(petilil);
        b.addAlly(lilligant);

        b.addFoe(happiny);
        b.addFoe(chansey);
        b.addFoe(blissey);


        b.go();
    }
}

