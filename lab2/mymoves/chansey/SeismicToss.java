package lab2.mymoves.chansey;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SeismicToss extends PhysicalMove {

    public SeismicToss(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return"использует " + pieces[pieces.length-1];
    }
}