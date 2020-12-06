package lab2.mymoves.blissey;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {

    public Thunderbolt(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

        if(MyUtils.chance(0.1)) {
            Effect.paralyze(def);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return"does " + pieces[pieces.length-1];
    }
}
