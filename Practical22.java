class Shape {
    protected double d1;
    protected double d2;

    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    public double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    public double area() {
        return d1 * d2;
    }
}

public class Practical22 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.getData(10, 6);

        Rectangle rectangle = new Rectangle();
        rectangle.getData(10, 6);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
        