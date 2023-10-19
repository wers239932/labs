package attacks.special;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect var1 = new Effect().chance(0.3).condition(Status.BURN).attack(30).turns( 1);
        pokemon.setCondition(var1);
    }
    @Override
    protected String describe() {
        return "использована атака Scald";
    }
}
