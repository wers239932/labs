package attacks.special;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect var1 = new Effect().chance(0.).condition(Status.FREEZE).attack(30).turns( 1);
        pokemon.setCondition(var1);
    }
    @Override
    protected String describe() {
        return "использована атака Blizzard";
    }
}
