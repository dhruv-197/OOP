class Practical8 {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Please provide exactly 2 numbers.");
            System.out.println("Example: java CommandLineCalc 10 20");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double sum = num1 + num2;
        double product = num1 * num2;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
