class SequentialPrinter extends Thread {
    private final int start;
    private final int end;

    public SequentialPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class Practical39 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        Thread t1 = new SequentialPrinter(1, 100);
        Thread t2 = new SequentialPrinter(101, 200);
        Thread t3 = new SequentialPrinter(201, 300);

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
    }
}

