package exercise;

import java.util.Locale;

// BEGIN
public class Cottage implements Home {
    private final double area;
    private final int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }

    public int compareTo(Home another) {
        return Double.compare(getArea(), another.getArea());
    }

    public String toString() {
        return String.format(Locale.US, "%d этажный коттедж площадью %.1f метров", floorCount, getArea());
    }
}
// END
