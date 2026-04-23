import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practical43 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        String fileName = "students.txt";
        BufferedWriter writer = null;
        BufferedReader reader = null;

        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("101, Riya, 89");
            writer.newLine();
            writer.write("102, Arjun, 78");
            writer.newLine();
            writer.write("103, Meera, 92");
            writer.newLine();
            System.out.println("Student records written to file.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Writer close error: " + e.getMessage());
            }
        }

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Student records:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Reader close error: " + e.getMessage());
            }
        }
    }
}

