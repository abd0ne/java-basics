package base.java.interfaces;

public interface InterfaceMain {
    static void staticMethod(){
        System.out.println("It's a static method in main interface ...");
    }
    abstract String mainMethod(); // abstract est optionnel > implicite
}
