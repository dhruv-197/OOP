import java.util.ArrayList;

class Box<T> {
    private final ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println(items);
    }
}

public class Practical49 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Riya");
        nameBox.addItem("Arjun");
        nameBox.addItem("Meera");

        Box<Integer> rollNoBox = new Box<>();
        rollNoBox.addItem(101);
        rollNoBox.addItem(102);
        rollNoBox.addItem(103);

        System.out.print("Names: ");
        nameBox.displayItems();

        System.out.print("Roll Numbers: ");
        rollNoBox.displayItems();
    }
}

