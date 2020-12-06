package lab2.mymoves.bruxish;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowSneak extends PhysicalMove {

    public ShadowSneak(double pow, double acc) {
        super(Type.WATER, pow, acc);

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
        return"использует " + pieces[pieces.length-1];
    }
}
