public class Practical35 {
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty");
        }

        double sum = 0;
        for (String value : values) {
            if (value == null) {
                throw new NullPointerException("Array element is null");
            }
            sum += Double.parseDouble(value);
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        String[][] testCases = {
            {"10", "20.5", "30"},
            {"10", null, "30"},
            {"10", "abc", "30"}
        };

        for (String[] testCase : testCases) {
            try {
                System.out.println("Average: " + average(testCase));
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Processing completed");
            }
            System.out.println();
        }
    }
}

