package lab2.mymoves.lilligant;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PetalBlizzard extends PhysicalMove {

    public PetalBlizzard(double pow, double acc) {
        super(Type.GRASS, pow, acc);

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return"совершает " + pieces[pieces.length-1];
    }
}