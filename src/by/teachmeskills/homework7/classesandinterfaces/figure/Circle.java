package by.teachmeskills.homework7.classesandinterfaces.figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double findSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double findPerimeter() {
        return 2 * radius * Math.PI;
    }
}
