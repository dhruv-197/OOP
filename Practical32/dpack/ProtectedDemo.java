package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        B bObj = new B(100, 200, 300);
        C cObj = new C();

        System.out.println("---- Access Specifier Demonstration ----");
        bObj.display();
        System.out.println();
        cObj.display();
    }
}
