package attacks.special;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class Icy_Wind extends SpecialMove {
    public Icy_Wind()
    {
        super(Type.ICE, 55, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect e = new Effect().chance(1).stat(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "использована атака Icy_Wind";
    }
}
