package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("Inside cpack.C (object of A):");
        System.out.println("public variable (pubVar)    : " + obj.pubVar);
        // System.out.println("protected variable (protVar): " + obj.protVar); // Not accessible
        // System.out.println("private variable (privVar): " + obj.privVar); // Not accessible
        System.out.println("protected variable (protVar): Not accessible in non-subclass outside package");
        System.out.println("private variable (privVar)  : Not accessible outside class A");
    }
}
