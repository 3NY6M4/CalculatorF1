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

        Drivers[] drivers = {Verstappen, Perez, Leclerc, Sainz, Russell, Hamilton,
                Norris, Ricciardo, Bottas, Guanyu, Gasly, Tsunoda, Schumacher, Magnussen,
                Vettel, Stroll, Alonso, Ocon, Albon, Latifi};

        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i].points > drivers[i++].points) {
                System.out.println(drivers[i]);
            } else if (drivers[i].points == drivers[i++].points) {
                System.out.println(drivers[i].price < drivers[i++].price);
            }

            Constructors[] constructors = {RedBull, Mercedes, Ferrari, McLaren, Alpine, AstonMartin, AlphaTauri, AlfaRomeo, Williams, Hass};

            for (int j = 0; j < constructors.length; j++) {
                if (constructors[j].points > constructors[j++].points) {
                    System.out.println(constructors[j]);
                } else if (constructors[j].points == constructors[j++].points) {
                    System.out.println(constructors[j].price < constructors[j++].price);
                }
            }
//    public void driver(){
        }
    }
}


