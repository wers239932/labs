package attacks.status;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 0);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        Effect e1 = new Effect().chance(1).stat(Stat.ATTACK, +1);
        Effect e2 = new Effect().chance(1).stat(Stat.SPECIAL_ATTACK, +1);
        pokemon.setCondition(e1);
        pokemon.setCondition(e2);
    }
    @Override
    protected String describe()
    {
        return "использована атака Growth";
    }
}
