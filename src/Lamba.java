import Salons.Salon;
import beepers.Beeper;
import engines.Engine;

public class Lamba extends Car{


    public Lamba(Beeper beeper, Engine engine, Salon salon) {
        super(beeper, engine, salon);
    }

    String getCost(){
        return "99999999999$";
    }
}
