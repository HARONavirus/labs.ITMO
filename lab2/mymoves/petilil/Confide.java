package lab2.mymoves.petilil;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;



public class Confide extends PhysicalMove {

    public Confide(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return"совершает " + pieces[pieces.length-1];
    }
}
