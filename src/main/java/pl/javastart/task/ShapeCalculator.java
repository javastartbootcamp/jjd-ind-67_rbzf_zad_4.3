package pl.javastart.task;

class ShapeCalculator {

    double calculateSquareArea(Square square) {
        return square.a * square.a;
    }

    double calculateCircleArea(Circle circle) {
        return circle.r * circle.r * 3.14;
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.a + rectangle.b);
    }
}
