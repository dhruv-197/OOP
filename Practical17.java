class University {
    static int totalStudents = 0;
    static String universityName;

    static {
        universityName = "Global Tech University";
        System.out.println("Static block executed: University name initialized to " + universityName);
    }

    {
        System.out.println("Instance block executed: Preparing to create a student object...");
    }

    public University() {
        totalStudents++;
        System.out.println("Constructor executed: Student #" + totalStudents + " added.");
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

public class Practical17 {
    public static void main(String[] args) {
        System.out.println("Main method started.");
        
        new University();
        new University();

        System.out.println("Final student count: " + University.getTotalStudents());
    }
}