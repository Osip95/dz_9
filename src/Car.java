import Salons.Salon;
import beepers.Beeper;
import engines.Engine;

public abstract class Car {
    Engine engine;
    Beeper beeper;
    Salon salon;
    public Car(Beeper beeper, Engine engine, Salon salon){
        this.engine = engine;
        this.beeper = beeper;
        this.salon = salon;
    }
}
