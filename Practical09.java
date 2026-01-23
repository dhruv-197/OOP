import java.util.Scanner;

class Practical09 {
    double width = 1.0;
    double height = 1.0;

    Practical09() {
    }

    Practical09(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        Practical09 rect = new Practical09(w, h);

        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        
        input.close();
    }
}