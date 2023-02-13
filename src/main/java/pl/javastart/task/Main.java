package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Pole kwadratu o boku " + square.a + " wynosi " + square.calculateSquareArea());
        System.out.println("Pole kola o promieniu " + circle.r + " wynosi " + circle.calculateCircleArea());
        System.out.println("Obwod prostokata o bokach " + rectangle.a + ", " + rectangle.b + " wynosi "
                + rectangle.calculateRectPerimeter());
        System.out.println("Obwod trojkata o bokach " + triangle.a + ", " + triangle.b + ", " + triangle.c
                + " wynosi " + triangle.calculateTrianglePerimeter());
    }
}
