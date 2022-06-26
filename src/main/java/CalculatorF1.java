import com.sun.jdi.Value;

import java.sql.Driver;
import java.util.*;

public class CalculatorF1 {

    public static void main(String[] args) {

//  Drivers

        Drivers Verstappen = new Drivers(65, 30.5);
        Drivers Hamilton = new Drivers(73, 30.0);
        Drivers Russell = new Drivers(65, 23.7);
        Drivers Leclerc = new Drivers(65, 19.0);
        Drivers Perez = new Drivers(65, 18.3);
        Drivers Sainz = new Drivers(65, 17.2);
        Drivers Norris = new Drivers(65, 15.8);
        Drivers Ricciardo = new Drivers(80, 13.5);
        Drivers Gasly = new Drivers(70, 12.9);
        Drivers Ocon = new Drivers(70, 12.4);
        Drivers Alonso = new Drivers(65, 12.2);
        Drivers Vettel = new Drivers(60, 11.4);
        Drivers Bottas = new Drivers(60, 9.6);
        Drivers Stroll = new Drivers(60, 9.0);
        Drivers Guanyu = new Drivers(60, 8.4);
        Drivers Tsunoda = new Drivers(60, 8.3);
        Drivers Albon = new Drivers(60, 7.8);
        Drivers Latifi = new Drivers(60, 6.6);
        Drivers Schumacher = new Drivers(60, 6.2);
        Drivers Magnussen = new Drivers(60, 6.1);

        System.out.println("Verstappen" + "\n" + "Points: " + Verstappen.getPoints() + " Price: " + Verstappen.getPrice());

//  Constructors

        Constructors Mercedes = new Constructors(32, 33.7);
        Constructors RedBull = new Constructors(32, 32.3);
        Constructors Ferrari = new Constructors(32, 25.8);
        Constructors McLaren = new Constructors(30, 17.6);
        Constructors Alpine = new Constructors(30, 13.9);
        Constructors AstonMartin = new Constructors(30, 11.0);
        Constructors AlphaTauri = new Constructors(25, 10.1);
        Constructors AlfaRomeo = new Constructors(20, 8.7);
        Constructors Williams = new Constructors(10, 6.5);
        Constructors Hass = new Constructors(5, 6.4);

        System.out.println("Hass" + Hass.getPoints());

        Map<Integer, Double>drivers = new HashMap<>();
        drivers.put(Verstappen.getPoints(), Verstappen.getPrice());
        drivers.put(Perez.getPoints(),Perez.getPrice());
        drivers.put(Leclerc.getPoints(), Leclerc.getPrice());
        drivers.put(Sainz.getPoints(), Sainz.getPrice());
        drivers.put(Russell.getPoints(), Russell.getPrice());
        drivers.put(Hamilton.getPoints(), Hamilton.getPrice());
        drivers.put(Norris.getPoints(), Norris.getPrice());
        drivers.put(Ricciardo.getPoints(), Ricciardo.getPrice());
        drivers.put(Bottas.getPoints(), Bottas.getPrice());
        drivers.put(Guanyu.getPoints(), Guanyu.getPrice());
        drivers.put(Gasly.getPoints(), Gasly.getPrice());
        drivers.put(Tsunoda.getPoints(), Tsunoda.getPrice());
        drivers.put(Schumacher.getPoints(), Schumacher.getPrice());
        drivers.put(Magnussen.getPoints(), Magnussen.getPrice());
        drivers.put(Vettel.getPoints(), Vettel.getPrice());
        drivers.put(Stroll.getPoints(), Stroll.getPrice());
        drivers.put(Alonso.getPoints(), Alonso.getPrice());
        drivers.put(Ocon.getPoints(), Ocon.getPrice());
        drivers.put(Albon.getPoints(), Albon.getPrice());
        drivers.put(Latifi.getPoints(), Latifi.getPrice());

        for (int i = 0; i < drivers.size(); i++) {
//            if(i.getPoints() > i+1.getPoints()) {
//             team.put(i)
            System.out.println(drivers);
//            } else if(i.getPoints() == i+1.getPoints()) {
//                  (i.getPrice() < i+1.getPrice() || i+1.getPrice() < i.getPrice()) {
//                  team.put(i.getPrice(min);
//                  }
//            }

            Constructors[] constructors = {RedBull, Mercedes, Ferrari, McLaren, Alpine, AstonMartin, AlphaTauri, AlfaRomeo, Williams, Hass};

//            for (int j = 0; j < constructors.length; j++) {
//                if (constructors[j].points > constructors[j++].points) {
//                    System.out.println(constructors[j]);
//                } else if (constructors[j].points == constructors[j++].points) {
//                    System.out.println(constructors[j].price < constructors[j++].price);
//                }
//            }
//    public void driver(){
        }
    }
}
