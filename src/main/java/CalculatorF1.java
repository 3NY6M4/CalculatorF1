import java.util.ArrayList;
import java.util.List;

public class CalculatorF1 {

    public static void main(String[] args) {

//  Drivers

        Drivers Verstappen = new Drivers("Verstappen", 50, 30.5);
        Drivers Hamilton = new Drivers("Hamilton", 50, 30.0);
        Drivers Russell = new Drivers("Russell", 50, 23.7);
        Drivers Leclerc = new Drivers("Leclerc", 50, 19.0);
        Drivers Perez = new Drivers("Perez", 50, 18.3);
        Drivers Sainz = new Drivers("Sainz", 50, 17.2);
        Drivers Norris = new Drivers("Norris", 50, 15.8);
        Drivers Piastri = new Drivers("Piastri", 50, 13.5);
        Drivers Gasly = new Drivers("Gasly", 50, 12.9);
        Drivers Ocon = new Drivers("Ocon", 50, 12.4);
        Drivers Alonso = new Drivers("Alonso", 50, 12.2);
        Drivers Sargent = new Drivers("Sargent", 50, 11.4);
        Drivers Bottas = new Drivers("Bottas", 50, 9.6);
        Drivers Stroll = new Drivers("Stroll", 50, 9.0);
        Drivers Guanyu = new Drivers("Guanyu", 50, 8.4);
        Drivers Tsunoda = new Drivers("Tsunoda", 50, 8.3);
        Drivers Albon = new Drivers("Albon", 50, 7.8);
        Drivers de_Vries = new Drivers("de_Vries", 50, 6.6);
        Drivers Hülkenberg = new Drivers("Hülkenberg", 50, 6.2);
        Drivers Magnussen = new Drivers("Magnussen", 50, 6.1);

//  Constructors

        Constructors Mercedes = new Constructors("Mercedes", 33, 33.7);
        Constructors RedBull = new Constructors("RedBull", 43, 32.3);
        Constructors Ferrari = new Constructors("Ferrari", 38, 25.8);
        Constructors McLaren = new Constructors("McLaren", 15, 17.6);
        Constructors Alpine = new Constructors("Alpine", 8, 13.9);
        Constructors AstonMartin = new Constructors("AstonMartin", 2, 11.0);
        Constructors AlphaTauri = new Constructors("AlphaTauri", 4, 10.1);
        Constructors AlfaRomeo = new Constructors("AlfaRomeo", 7, 8.7);
        Constructors Williams = new Constructors("Williams", 0, 6.5);
        Constructors Hass = new Constructors("Hass", 1, 6.4);

        List<Drivers> drivers = List.of(
                Verstappen, Perez,
                Hamilton, Russell,
                Leclerc, Sainz,
                Norris, Piastri,
                Gasly, Ocon,
                Alonso, Stroll,
                Albon, Sargent,
                Bottas, Guanyu,
                de_Vries, Tsunoda,
                Magnussen, Hülkenberg);

        List<Constructors> constructors = List.of(
                RedBull,
                Mercedes,
                Ferrari,
                McLaren,
                Alpine,
                AstonMartin,
                Williams,
                AlfaRomeo,
                AlphaTauri,
                Hass);

        int maxSumPoints = 0;
        double minSumPrice = 0;
        String bestCombination = "";
        List<String> otherCombinations = new ArrayList<>();

        // Loop through all combinations of 5 entries from drivers
        for (int i = 0; i < drivers.size(); i++) {
            for (int j = i + 1; j < drivers.size(); j++) {
                for (int k = j + 1; k < drivers.size(); k++) {
                    for (int l = k + 1; l < drivers.size(); l++) {
                        for (int m = l + 1; m < drivers.size(); m++) {
                            Drivers drivers1 = drivers.get(i);
                            Drivers drivers2 = drivers.get(j);
                            Drivers drivers3 = drivers.get(k);
                            Drivers drivers4 = drivers.get(l);
                            Drivers drivers5 = drivers.get(m);

                            // Loop through all combinations of 1 entries from constructors
                            for (int n = 0; n < constructors.size(); n++) {
                                Constructors constructors1 = constructors.get(n);

                                int sumPoints = drivers1.getPoints() + drivers2.getPoints() + drivers3.getPoints() + drivers4.getPoints() + drivers5.getPoints() + constructors1.getPoints();
                                double sumPrice = drivers1.getPrice() + drivers2.getPrice() + drivers3.getPrice() + drivers4.getPrice() + drivers5.getPrice() + constructors1.getPrice();
                                String combination = "\n" + drivers1.getName() + " (Points: " + drivers1.getPoints() + " Price: " + drivers1.getPrice() + ")\n" +
                                        drivers2.getName() + " (Points: " + drivers2.getPoints() + " Price: " + drivers2.getPrice() + ")\n" +
                                        drivers3.getName() + " (Points: " + drivers3.getPoints() + " Price: " + drivers3.getPrice() + ")\n" +
                                        drivers4.getName() + " (Points: " + drivers4.getPoints() + " Price: " + drivers4.getPrice() + ")\n" +
                                        drivers5.getName() + " (Points: " + drivers5.getPoints() + " Price: " + drivers5.getPrice() + ")\n" +
                                        constructors1.getName() + " (Points: " + constructors1.getPoints() + " Price: " + constructors1.getPrice() + ")\n";

                                // Do something with the combination of 5 entries and check the sum of the price fields is less than or equal to 100.0
                                if (sumPrice <= 100.0) {
                                    if (sumPoints > maxSumPoints || (sumPoints == maxSumPoints && sumPrice < minSumPrice)) {
                                        // Update the maximum sum and the corresponding combination
                                        maxSumPoints = sumPoints;
                                        minSumPrice = sumPrice;
                                        bestCombination = combination;

                                    } else if (sumPoints == maxSumPoints && sumPrice > minSumPrice) {
                                        // Add the combination to the list of other combinations with the same maximum sum of points
                                        otherCombinations.add(combination);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // Print all other combinations with the same maximum sum of points
          for (String otherCombination : otherCombinations) {
            System.out.println("\n" + "Other combinations with the same maximum sum of points: " + otherCombination);
            System.out.println("Maximum sum of points: " + maxSumPoints);
              System.out.println("Total price: " + (float) minSumPrice);
        }
        // Print the maximum sum and the corresponding combination
            System.out.println("\n" + "The best combination: " + bestCombination);
            System.out.println("Maximum sum of points: " + maxSumPoints);
            System.out.println("Total price: " + (float) minSumPrice);
    }
}