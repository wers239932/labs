package attacks.status;

import ru.ifmo.se.pokemon.*;

public class Confuse_Ray extends StatusMove {
    public Confuse_Ray() {
        super(Type.GHOST, 0, 100);

    }

    @Override
    protected void 	applyOppEffects (Pokemon pokemon)
    {
        Effect var1 = new Effect().chance(0.33).condition(Status.PARALYZE).attack(0).turns( 1+(int)(Math.random()*3));
        pokemon.setCondition(var1);
    }



    @Override
    protected String describe() {
        return "использована атака Confuse_Ray";
    }
}
