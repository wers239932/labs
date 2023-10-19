package pokemon;

import attacks.special.Blizzard;
import attacks.special.Hydro_Pump;
import attacks.special.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Lombre extends Pokemon {
    public Lombre (String Name, int level)
    {
        super(Name, level);
        setType(Type.WATER,Type.GRASS);
        setStats(60,50,50,60,70,50);
        setMove(new Scald());
        setMove(new Blizzard());
        setMove(new Hydro_Pump());
    }

}
