import Salons.Salon;
import beepers.Beeper;
import engines.Engine;

public class Niva extends Car{

    public Niva(Beeper beeper, Engine engine, Salon salon) {
        super(beeper, engine, salon);
    }

    public String rideInTheMud(){
        return "Проехал грязь";
    }
}
