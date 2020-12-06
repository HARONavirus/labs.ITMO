package lab2.mypokemons;

import lab2.mymoves.petilil.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Petilil extends Pokemon {

    public Petilil(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(45, 35, 50, 70, 50, 30);

        MegaDrain megaDrain = new MegaDrain(40, 100);
        Confide confide = new Confide(85, 100);
        Facade facade = new Facade(70, 100);

        super.setMove(megaDrain, confide, facade);

    }
}