public class Practical21 {
    public double calculateVolume(double side) {
        return side * side * side;
    }

    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public double calculateVolume(int radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        Practical21 calculator = new Practical21();

        double cubeVolume = calculator.calculateVolume(4.0);
        double rectangularCubeVolume = calculator.calculateVolume(5.0, 3.0, 2.0);
        double sphereVolume = calculator.calculateVolume(3);

        System.out.printf("Cube volume (side = 4): %.2f%n", cubeVolume);
        System.out.printf("Rectangular cube volume (5 x 3 x 2): %.2f%n", rectangularCubeVolume);
        System.out.printf("Sphere volume (radius = 3): %.2f%n", sphereVolume);
    }
}

