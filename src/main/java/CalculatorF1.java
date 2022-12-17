import java.util.ArrayList;
import java.util.List;

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
        Drivers Piastri = new Drivers(80, 13.5);
        Drivers Gasly = new Drivers(70, 12.9);
        Drivers Ocon = new Drivers(70, 12.4);
        Drivers Alonso = new Drivers(65, 12.2);
        Drivers Vettel = new Drivers(60, 11.4);
        Drivers Bottas = new Drivers(60, 9.6);
        Drivers Stroll = new Drivers(60, 9.0);
        Drivers Guanyu = new Drivers(60, 8.4);
        Drivers Tsunoda = new Drivers(60, 8.3);
        Drivers Albon = new Drivers(60, 7.8);
        Drivers de_Vries = new Drivers(60, 6.6);
        Drivers Hülkenberg = new Drivers(60, 6.2);
        Drivers Magnussen = new Drivers(60, 6.1);

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

        List<Drivers> drivers = new ArrayList<>();
        drivers.add(new Drivers(Verstappen.getPoints(), Verstappen.getPrice()));
        drivers.add(new Drivers(Perez.getPoints(),Perez.getPrice()));
        drivers.add(new Drivers(Leclerc.getPoints(), Leclerc.getPrice()));
        drivers.add(new Drivers(Sainz.getPoints(), Sainz.getPrice()));
        drivers.add(new Drivers(Russell.getPoints(), Russell.getPrice()));
        drivers.add(new Drivers(Hamilton.getPoints(), Hamilton.getPrice()));
        drivers.add(new Drivers(Norris.getPoints(), Norris.getPrice()));
        drivers.add(new Drivers(Piastri.getPoints(), Piastri.getPrice()));
        drivers.add(new Drivers(Bottas.getPoints(), Bottas.getPrice()));
        drivers.add(new Drivers(Guanyu.getPoints(), Guanyu.getPrice()));
        drivers.add(new Drivers(Gasly.getPoints(), Gasly.getPrice()));
        drivers.add(new Drivers(Tsunoda.getPoints(), Tsunoda.getPrice()));
        drivers.add(new Drivers(Hülkenberg.getPoints(), Hülkenberg.getPrice()));
        drivers.add(new Drivers(Magnussen.getPoints(), Magnussen.getPrice()));
        drivers.add(new Drivers(Vettel.getPoints(), Vettel.getPrice()));
        drivers.add(new Drivers(Stroll.getPoints(), Stroll.getPrice()));
        drivers.add(new Drivers(Alonso.getPoints(), Alonso.getPrice()));
        drivers.add(new Drivers(Ocon.getPoints(), Ocon.getPrice()));
        drivers.add(new Drivers(Albon.getPoints(), Albon.getPrice()));
        drivers.add(new Drivers(de_Vries.getPoints(), de_Vries.getPrice()));

        List<Constructors> constructors = new ArrayList<>();
        constructors.add(new Constructors(Mercedes.getPoints(), Mercedes.getPrice()));
        constructors.add(new Constructors(RedBull.getPoints(),RedBull.getPrice()));
        constructors.add(new Constructors(Ferrari.getPoints(), Ferrari.getPrice()));
        constructors.add(new Constructors(McLaren.getPoints(), McLaren.getPrice()));
        constructors.add(new Constructors(Alpine.getPoints(), Alpine.getPrice()));
        constructors.add(new Constructors(AstonMartin.getPoints(), AstonMartin.getPrice()));
        constructors.add(new Constructors(AlphaTauri.getPoints(), AlphaTauri.getPrice()));
        constructors.add(new Constructors(AlfaRomeo.getPoints(), AlfaRomeo.getPrice()));
        constructors.add(new Constructors(Williams.getPoints(), Williams.getPrice()));
        constructors.add(new Constructors(Hass.getPoints(), Hass.getPrice()));

        List<Object> combinations = new ArrayList<>();

//  Pętla po rekordach z pierwszego zbioru (drivers)
        for (int i = 0; i < drivers.size(); i++) {
            for (int j = i + 1; j < drivers.size(); j++) {
                for (int k = j + 1; k < drivers.size(); k++) {
                    for (int l = k + 1; l < drivers.size(); l++) {
                        for (int m = l + 1; m < drivers.size(); m++) {

//  Pętla po rekordach z drugiego zbioru (constructors)
                            for (int n = m +1; n <constructors.size(); n++) { // for (Constructors c : constructors) {

//  Jeśli cena jest mniejsza lub równa 100, dodaj kombinację do listy

        if (drivers.get(i).getPrice() + drivers.get(j).getPrice() + drivers.get(k).getPrice() + drivers.get(l).getPrice() + drivers.get(m).getPrice() + constructors.get(n).getPrice() <= 100) {
            List<Object> combination = new ArrayList<>();
            combination.add(drivers.get(i));
            combination.add(drivers.get(j));
            combination.add(drivers.get(k));
            combination.add(drivers.get(l));
            combination.add(drivers.get(m));
            combination.add(constructors.get(n));
            combinations.add(combination);
                        }
                    }
                }
            }
        }

// Znajdź kombinację z największą ilością punktów
        List<Object> bestCombination = null;
        int bestPoints = 0;
        for (List<Object> combination : combinations) {
            int points = 0;
            for (Object o : combination) {
                if (o instanceof Drivers) {
                    points += ((Drivers) o).getPoints();
                } else if (o instanceof Constructors) {
                    points += ((Constructors) o).getPoints();
                }
            }
            if (points > bestPoints) {
                bestCombination = combination;
                bestPoints = points;
            }
        }

        // Wypisanie wybranej kombinacji
        System.out.println("Wybrana kombinacja: " + bestCombination);
    }
        }
    }
}