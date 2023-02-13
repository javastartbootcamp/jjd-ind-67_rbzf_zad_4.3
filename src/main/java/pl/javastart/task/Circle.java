package pl.javastart.task;

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculateCircleArea() {
        return r * r * 3.14;
    }
}
