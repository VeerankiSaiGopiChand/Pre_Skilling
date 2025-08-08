package Day3;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        System.out.println("Circle area: " + c.area());
    }
}

