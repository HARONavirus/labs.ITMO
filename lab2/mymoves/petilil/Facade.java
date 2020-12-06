package lab2.mymoves.petilil;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Facade extends PhysicalMove {

    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        if ((def.getCondition() == Status.PARALYZE)||(def.getCondition() == Status.PARALYZE)||(def.getCondition()==Status.BURN)){
            def.setMod(Stat.HP, (int) Math.round(2*damage));}
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return"совершает " + pieces[pieces.length-1];
    }
}
