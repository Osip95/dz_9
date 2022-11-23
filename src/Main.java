import Developers.CPlusPlusDeveloper;
import Developers.JavaDeveloper;
import Salons.BigSalon;
import Salons.LittleSalon;
import Salons.Salon;
import beepers.*;
import engines.*;
import langugeProgramming.Java;
import langugeProgramming.LangugeProgramming;
import langugeProgramming.СPlusPlus;



public class Main {
    public static void main(String[] args) {
        Beeper horn = new Horn();
        Engine engineV12 = new EngineV12();
        Salon littleSalon = new LittleSalon();
        Lamba lamba = new Lamba(horn, engineV12,littleSalon);

        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        Priora priora = new Priora(magicSound, engineV6,littleSalon);

        Beeper gudelkaShiguli = new GudelkaShiguli();
        Engine engineV4 = new EngineV4();
        Salon bigSalon = new BigSalon();
        Kopeika kopeika = new Kopeika(gudelkaShiguli, engineV4,bigSalon);

        Beeper recordPlayer = new RecordPlayer();
        Engine engineV8 = new EngineV8();
        Niva niva = new Niva(recordPlayer, engineV8,bigSalon);

        LangugeProgramming java = new Java();
        LangugeProgramming cPlusPlus = new СPlusPlus();

        JavaDeveloper javaDeveloper = new JavaDeveloper(java,25);
        CPlusPlusDeveloper cPlusPlusDeveloper = new CPlusPlusDeveloper(cPlusPlus,30);

        System.out.println(lamba.beeper.makeSound());
        System.out.println(lamba.engine.getSpid());
        System.out.println(lamba.salon.getSeats());
        System.out.println(lamba.getCost());

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpid());
        System.out.println(priora.salon.getSeats());
        System.out.println(priora.downShifting());

        System.out.println(kopeika.beeper.makeSound());
        System.out.println(kopeika.engine.getSpid());
        System.out.println(kopeika.salon.getSeats());
        System.out.println(kopeika.fly());

        System.out.println(niva.beeper.makeSound());
        System.out.println(niva.engine.getSpid());
        System.out.println(niva.salon.getSeats());
        System.out.println(niva.rideInTheMud());

        System.out.println(javaDeveloper.getAge());
        System.out.println(javaDeveloper.getLangugeProgramming().getFunctional());

        System.out.println(cPlusPlusDeveloper.getAge());
        System.out.println(cPlusPlusDeveloper.getLangugeProgramming().getFunctional());


    }
}