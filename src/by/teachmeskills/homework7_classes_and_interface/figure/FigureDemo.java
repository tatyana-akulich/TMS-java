package by.teachmeskills.homework7_classes_and_interface.figure;

public class FigureDemo {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(5),
                new Triangle(3, 9, 10),
                new Circle(8),
                new Rectangle(5, 15),
                new Rectangle(3, 10)
        };
        double sumOfPerimeters = 0;
        for (Figure element : figures) {
            sumOfPerimeters += element.findPerimeter();
        }
        System.out.printf("Sum of perimeters is %.2f", sumOfPerimeters);
    }
}
