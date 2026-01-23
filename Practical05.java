import java.util.Scanner;

class Practical05 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        int[] notes = {100, 50, 10, 5, 2, 1};

        System.out.println("\nMinimum number of notes:");

        for (int note : notes) {
            int count = amount / note;  
            amount = amount % note;     

            if (count > 0) {
                System.out.println(note + " : " + count);
            }
        }

        sc.close();
    }
}
