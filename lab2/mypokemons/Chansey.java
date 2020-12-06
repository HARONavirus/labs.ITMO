package lab2.mypokemons;

import lab2.mymoves.chansey.*;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Happiny {

    public Chansey(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(100, 5, 5, 15, 65, 30);

        SeismicToss seismicToss = new SeismicToss(0, 100);


        super.setMove(seismicToss);

    }
}