package Figures;

public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
    }

    public double getPerimeter () {
        return 2 * Math.PI * r1;
    }
}
