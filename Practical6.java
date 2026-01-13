import java.util.Scanner;

class Practical6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        for (int i = 0; i < 5; i++) {
            int digit = num % 10;  
            num = num / 10;

            int sum = digit + 1 + carry;

            int newDigit = sum % 10;  
            carry = sum / 10;       

            result = result + (newDigit * place);
            place *= 10;
        }

        if (carry > 0) {
            result = result + (carry * place);
        }

        System.out.println("New number: " + result);

        sc.close();
    }
}
