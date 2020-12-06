package lab2.mypokemons;

import lab2.mymoves.blissey.*;
import ru.ifmo.se.pokemon.Type;

public class Blissey extends Chansey {

    public Blissey(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(255, 10, 10, 75, 135, 55);

        Thunderbolt thunderbolt = new Thunderbolt(90, 100);


        super.setMove(thunderbolt);
    }
}