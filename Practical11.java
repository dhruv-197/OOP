import java.util.Scanner;

class Practical11 {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void displayTime() {
        System.out.println(hours + " hours and " + minutes + " minutes");
    }

    void addTime(Practical11 t1, Practical11 t2) {
        int totalMinutes = t1.minutes + t2.minutes;
        this.minutes = totalMinutes % 60;
        int extraHours = totalMinutes / 60;
        this.hours = t1.hours + t2.hours + extraHours;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practical11 t1 = new Practical11();
        Practical11 t2 = new Practical11();
        Practical11 t3 = new Practical11();

        System.out.println("Enter Time 1 (hours and minutes):");
        t1.setTime(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Time 2 (hours and minutes):");
        t2.setTime(sc.nextInt(), sc.nextInt());

        t3.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();
        System.out.print("Time 2: ");
        t2.displayTime();
        System.out.print("Total Added Time: ");
        t3.displayTime();

        sc.close();
    }
}