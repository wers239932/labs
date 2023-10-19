package pokemon;

import attacks.special.Blizzard;
import attacks.special.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Lotad extends Pokemon {
    public Lotad (String Name, int level)
    {
        super(Name, level);
        setType(Type.WATER,Type.GRASS);
        setStats(40,30,30,40,50,30);
        setMove(new Scald());
        setMove(new Blizzard());
    }

}
