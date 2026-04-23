public class Practical33 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Usage: java Practical33 <numerator> <denominator>");
            }

            double numerator = Double.parseDouble(args[0]);
            double denominator = Double.parseDouble(args[1]);

            if (denominator == 0) {
                throw new ArithmeticException("Denominator cannot be zero");
            }

            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

