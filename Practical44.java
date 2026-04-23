import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practical44 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        String fileName = "data.txt";
        int lines = 0;
        int words = 0;
        int chars = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;

                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;
                }

                chars += line.replace(" ", "").length();
            }

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters (excluding spaces/newlines): " + chars);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}

