class NumberPrinter extends Thread {
    private final int start;
    private final int end;
    private final long delay;

    public NumberPrinter(int start, int end, long delay) {
        this.start = start;
        this.end = end;
        this.delay = delay;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Practical38 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        Thread t1 = new NumberPrinter(1, 10, 1000);
        Thread t2 = new NumberPrinter(11, 20, 500);

        t1.start();
        t2.start();
    }
}

