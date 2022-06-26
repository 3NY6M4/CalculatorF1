public class Drivers {

    private Integer points;
    private Double price;

    public Drivers(Integer points, Double price) {
        this.points = points;
        this.price = price;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
