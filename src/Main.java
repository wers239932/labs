import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        var battle = new Battle();
        battle.addAlly(new Shaymin_Land("eee",10));
        battle.addAlly(new Froslass("iii",10));
        battle.addFoe(new Shaymin_Land("sus", 1000));
        battle.go();
    }
}