package attacks.special;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class Shadow_Ball extends SpecialMove {
    public Shadow_Ball()
    {
        super(Type.GHOST, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.setCondition(e);
    }
    @Override
    protected String describe() {
        return "использована атака Shadow_Ball";
    }
}
