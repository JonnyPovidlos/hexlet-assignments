package exercise;

// BEGIN
public class Circle {
    private final Point point;
    private final int radius;

    public Circle(Point p, int r) {
        this.point = p;
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("");
        }
        return Math.PI * radius * radius;
    }
}
// END
