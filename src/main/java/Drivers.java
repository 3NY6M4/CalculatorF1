public class Drivers {

    private String driverName;
    private int points;
    private double price;

    public Drivers(String driverName, int points, double price) {
        this.driverName = driverName;
        this.points = points;
        this.price = price;
    }

    public String getName() {
        return driverName;
    }

    public void setName(String driverName) {
        this.driverName = driverName;
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
