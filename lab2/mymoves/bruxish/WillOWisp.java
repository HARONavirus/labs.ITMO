package lab2.mymoves.bruxish;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WillOWisp extends SpecialMove {
    public WillOWisp(double pow, double acc) {
        super(Type.ICE, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(MyUtils.chance(0.1)) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return"совершает " + pieces[pieces.length-1];
    }
}