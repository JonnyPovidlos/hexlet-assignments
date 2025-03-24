package exercise;

import java.util.Locale;

// BEGIN
public class Flat implements Home {
    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    public int compareTo(Home another) {
        return Double.compare(getArea(), another.getArea());
    }

    public String toString() {
        return String.format(Locale.US, "Квартира площадью %.1f метров на %d этаже", getArea(), floor);
    }
}
// END
