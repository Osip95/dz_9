import Salons.Salon;
import beepers.Beeper;
import engines.Engine;

public class Priora extends Car {

    public Priora(Beeper beeper, Engine engine, Salon salon) {
        super(beeper, engine, salon);
    }

    String downShifting(){
        return "Занижена";
    }
}
