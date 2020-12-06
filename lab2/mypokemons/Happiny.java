package lab2.mypokemons;

import lab2.mymoves.happiny.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {

    public Happiny(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(100, 5, 5, 15, 65, 30);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        DreamEater dreamEater =  new DreamEater(80, 100);


        super.setMove(flamethrower, dreamEater);

    }
}