package pl.javastart.task;

class Rectangle {
    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculateRectPerimeter() {
        return 2 * (a + b);
    }
}
