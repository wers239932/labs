package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
public class Facade extends PhysicalMove
{
    public Facade()
    {
        super(Type.NORMAL, 70,100);
    }
    @Override
    protected String describe()
    {
        return "использована атака Facade";
    }
}
