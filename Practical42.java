import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practical42 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        if (args.length != 1) {
            System.out.println("Usage: java Practical42 <filename>");
            return;
        }

        String fileName = args[0];
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    wordCount += trimmed.split("\\s+").length;
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

