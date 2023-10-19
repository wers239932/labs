package pokemon;

import attacks.physical.Rest;
import attacks.special.Icy_Wind;
import attacks.special.Shadow_Ball;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Snorunt extends Pokemon {
    public Snorunt (String Name, int level)
    {
        super(Name, level);
        setType(Type.ICE);
        setStats(50,50,50,50,50,50);
        setMove(new Shadow_Ball());
        setMove(new Icy_Wind());
        setMove(new Rest());
    }

}
