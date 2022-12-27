public class Constructors {

    private String constructorName;
    private int points;
    private double price;

    public Constructors(String constructorName, int points, double price) {
        this.constructorName = constructorName;
        this.points = points;
        this.price = price;
    }

    public String getName() {
        return constructorName;
    }

    public void setName(String constructorName) {
        this.constructorName = constructorName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
