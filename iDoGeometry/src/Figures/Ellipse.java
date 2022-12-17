package Figures;

public class Ellipse {
    double r1, r2;

    public Ellipse(double radius1, double radius2, double xCoord, double yCoord) {
        this(radius1, radius2, new Point(xCoord, yCoord));
    }

    public Ellipse(double radius1, double radius2, Point centerPoint) {
        super(centerPoint);
        r1 = radius1;
        r2 = radius2;

    }

    public double getArea() {
        return Math.PI * r1 * r2;
    }

    public double getPerimeter() {
        return 4 * (Math.PI * r1 * r2 + r1 - r2) / (r1 + r2);
    }
}
