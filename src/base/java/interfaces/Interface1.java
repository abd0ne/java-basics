package base.java.interfaces;

public interface Interface1 extends InterfaceMain {
    int CONST = 10; // implicitement static
    static void print(){
        System.out.println("Static method in Interface1");
    }
}