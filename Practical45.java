import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practical45 {
    private static void printProperties(String filePath) {
        File file = new File(filePath);
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File size (bytes): " + file.length());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last modified: " +
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
    }

    private static void copyFile(String source, String destination) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy   : java Practical45 copy <source> <destination>");
            System.out.println("Delete : java Practical45 delete <file>");
            System.out.println("Rename : java Practical45 rename <oldname> <newname>");
            return;
        }

        String command = args[0].toLowerCase();

        try {
            switch (command) {
                case "copy":
                    if (args.length != 3) {
                        throw new IllegalArgumentException("copy requires source and destination");
                    }
                    copyFile(args[1], args[2]);
                    System.out.println("File copied successfully.");
                    printProperties(args[2]);
                    break;
                case "delete":
                    if (args.length != 2) {
                        throw new IllegalArgumentException("delete requires file path");
                    }
                    Files.delete(new File(args[1]).toPath());
                    System.out.println("File deleted successfully.");
                    break;
                case "rename":
                    if (args.length != 3) {
                        throw new IllegalArgumentException("rename requires oldname and newname");
                    }
                    File oldFile = new File(args[1]);
                    File newFile = new File(args[2]);
                    if (oldFile.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                        printProperties(args[2]);
                    } else {
                        System.out.println("Rename operation failed.");
                    }
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

