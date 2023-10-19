package attacks.physical;

import ru.ifmo.se.pokemon.*;

public class Rest extends PhysicalMove {
    public Rest()
    {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        Effect var1 = (new Effect()).condition(Status.SLEEP).attack(0.0).turns((2));
        pokemon.setCondition(var1);
        //pokemon.setMod(Stat.HP,100);
        pokemon.restore();
    }

    @Override
    protected String describe() {
        return "использована атака Rest";
    }
}
