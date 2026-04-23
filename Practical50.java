import java.util.LinkedList;

public class Practical50 {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        LinkedList<String> names = new LinkedList<>();
        names.add("Riya");
        names.add("Arjun");
        names.add("Meera");

        System.out.println("Search 102 in roll numbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 999 in roll numbers: " + searchElement(rollNumbers, 999));

        System.out.println("Search Arjun in names: " + searchElement(names, "Arjun"));
        System.out.println("Search Karan in names: " + searchElement(names, "Karan"));
    }
}

