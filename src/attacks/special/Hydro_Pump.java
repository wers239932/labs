package attacks.special;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class Hydro_Pump extends SpecialMove {
    public Hydro_Pump() {
        super(Type.WATER, 110, 80);
    }

    @Override
    protected String describe() {
        return "использована атака Hydro_Pump";
    }
}
