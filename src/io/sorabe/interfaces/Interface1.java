package io.sorabe.interfaces;

public interface Interface1 extends InterfaceMain {
    int X = 10; // implicitement static
    static void print(){
        System.out.println("Hello");
    }
}