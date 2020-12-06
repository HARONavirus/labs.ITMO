package lab2.mypokemons;

import lab2.mymoves.lilligant.*;
import ru.ifmo.se.pokemon.Type;

public class Lilligant extends Petilil {

    public Lilligant(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(70, 60, 75, 110, 75, 90);


        PetalBlizzard petalBlizzard = new PetalBlizzard(90, 100);

        super.setMove(petalBlizzard);


    }
}