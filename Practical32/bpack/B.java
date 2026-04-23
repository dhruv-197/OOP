package bpack;

import apack.A;

public class B extends A {
    public B(int pubVar, int protVar, int privVar) {
        super(pubVar, protVar, privVar);
    }

    public void display() {
        System.out.println("Inside bpack.B (extends A):");
        System.out.println("public variable (pubVar)    : " + pubVar);
        System.out.println("protected variable (protVar): " + protVar);
        
        System.out.println("private variable (privVar)  : Not accessible in subclass");
    }
}
