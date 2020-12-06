package lab2.mypokemons;

import lab2.mymoves.bruxish.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bruxish extends Pokemon {

    public Bruxish(String name, int level) {
        super(name, level);

        super.setType(Type.WATER, Type.PSYCHIC);
        super.setStats(68, 105,70,70,70,92);

        ShadowSneak shadowSneak = new ShadowSneak(40, 100);
        LeechLife leechLife = new LeechLife(0, 85);
        WillOWisp willOWisp = new WillOWisp(90, 100);
        DreamEater dreamEater = new DreamEater(80,100);

        super.setMove(shadowSneak, leechLife, willOWisp, dreamEater);

    }
}