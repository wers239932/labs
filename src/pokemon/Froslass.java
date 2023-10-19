package pokemon;

import attacks.physical.Rest;
import attacks.special.Icy_Wind;
import attacks.special.Shadow_Ball;
import attacks.status.Confuse_Ray;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Froslass extends Pokemon {
    public Froslass (String Name, int level)
    {
        super(Name, level);
        setType(Type.ICE,Type.GHOST);
        setStats(70,80,70,80,70,110);
        setMove(new Shadow_Ball());
        setMove(new Icy_Wind());
        setMove(new Rest());
        setMove(new Confuse_Ray());
    }

}
