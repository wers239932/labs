package pokemon;

import attacks.physical.Facade;
import attacks.special.Blizzard;
import attacks.special.Hydro_Pump;
import attacks.special.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Ludicolo extends Pokemon {
    public Ludicolo (String Name, int level)
    {
        super(Name, level);
        setType(Type.WATER,Type.GRASS);
        setStats(80,70,70,90,100,70);
        setMove(new Scald());
        setMove(new Blizzard());
        setMove(new Hydro_Pump());
        setMove(new Facade());
    }

}
