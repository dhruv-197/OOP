import java.util.Scanner;

interface Order
{
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order
{
    String item;
    int qty;
    int orderId = 101;

    public void placeOrder(String item, int qty)
    {
        this.item = item;
        this.qty = qty;
        System.out.println("Order Placed");
        System.out.println("Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder
{
    public void cancelOrder(int orderId)
    {
        if(this.orderId == orderId)
            System.out.println("Order Cancelled");
        else
            System.out.println("Invalid Order ID");
    }

    public void generateBill()
    {
        int price = 100;
        int total = price * qty;

        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: " + total);
    }
}

public class Practical29
{
    public static void main(String[] args)
    {
        System.out.println("Dhruv Soni - 240390107005");
        Scanner sc = new Scanner(System.in);

        FinalOrder f = new FinalOrder();

        System.out.print("Enter item: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        f.placeOrder(item, qty);

        System.out.println("1.Generate Bill");
        System.out.println("2.Cancel Order");

        int ch = sc.nextInt();

        if(ch == 1)
            f.generateBill();
        else if(ch == 2)
            f.cancelOrder(101);
        sc.close();
    }
}
