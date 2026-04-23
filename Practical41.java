class SumThread extends Thread {
    private final int start;
    private final int end;
    private long sum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

public class Practical41 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }

        long total = t1.getSum() + t2.getSum();
        System.out.println("Final Sum: " + total);
    }
}

