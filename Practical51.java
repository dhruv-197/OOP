import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practical51 {
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(3);

        ArrayList<String> names = new ArrayList<>();
        names.add("Riya");
        names.add("Arjun");
        names.add("Meera");
        names.add("Dev");

        System.out.println("Numbers before sorting: " + numbers);
        sortList(numbers);
        System.out.println("Numbers after sorting: " + numbers);

        System.out.println("Names before sorting: " + names);
        sortList(names);
        System.out.println("Names after sorting: " + names);
    }
}

