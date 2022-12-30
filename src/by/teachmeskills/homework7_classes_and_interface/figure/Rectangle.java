package by.teachmeskills.homework7_classes_and_interface.figure;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double findSquare() {
        return side1 * side2;
    }

    @Override
    public double findPerimeter() {
        return (side1 + side2) * 2;
    }
}
