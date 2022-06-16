public class Constructors {

    private int points;
    private double price;

    public Constructors(int points, double price) {
        this.points = points;
        this.price = price;
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
