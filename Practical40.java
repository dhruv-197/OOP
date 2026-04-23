class TablePrinter {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}

class TableThread extends Thread {
    private final TablePrinter printer;
    private final int number;

    public TableThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    public void run() {
        printer.printTable(number);
    }
}

public class Practical40 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        TablePrinter printer = new TablePrinter();
        Thread t1 = new TableThread(printer, 5);
        Thread t2 = new TableThread(printer, 7);

        t1.start();
        t2.start();
    }
}

