import java.util.Scanner;

class Practical12 {
    int x;
    int y;

    Practical12() {
        x = 5;
        y = 5;
    }

    Practical12(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Practical12(Practical12 p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Practical12 p1 = new Practical12();
        System.out.print("Default ");
        p1.display();

        System.out.print("Enter x and y for new point: ");
        int inputX = sc.nextInt();
        int inputY = sc.nextInt();
        Practical12 p2 = new Practical12(inputX, inputY);
        System.out.print("Parameterized ");
        p2.display();

        Practical12 p3 = new Practical12(p2);
        System.out.print("Copy of Point 2 ");
        p3.display();

        sc.close();
    }
}