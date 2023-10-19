package attacks.special;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class Dazzling_Gleam extends SpecialMove {
    public Dazzling_Gleam() {
        super(Type.FAIRY, 80, 100);
    }

    @Override
    protected String describe() {
        return "использована атака Dazzling_Gleam";
    }
}
