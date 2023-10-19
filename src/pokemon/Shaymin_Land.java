package pokemon;


import attacks.physical.Rest;
import attacks.special.Dazzling_Gleam;
import attacks.special.Psychic;
import attacks.status.Growth;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Shaymin_Land extends Pokemon {
    public Shaymin_Land (String Name, int level)
    {
        super(Name, level);
        setType(Type.GRASS);
        setStats(100,100,100,100,100,100);
        setMove(new Rest());
        setMove(new Psychic());
        setMove(new Growth());
        setMove(new Dazzling_Gleam());
    }

}
