import java.util.Scanner;

class Practical06 {
    public static void main(String args[]) {
        System.out.println("Dhruv Soni - 240390107005");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;

        for (int i = 0; i < 5; i++) {
            int digit = num % 10;
            num = num / 10;

            int newDigit = (digit + 1) % 10;

            result = result + (newDigit * place);
            place *= 10;
        }

        System.out.printf("New number: %05d\n", result);

        sc.close();
    }
}