import Salons.Salon;
import beepers.Beeper;
import engines.Engine;

public class Kopeika extends Car {

    public Kopeika(Beeper beeper, Engine engine, Salon salon) {
        super(beeper, engine, salon);
    }

    public String fly(){
        return "летим";
    }
}
