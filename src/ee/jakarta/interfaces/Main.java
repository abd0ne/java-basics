package ee.jakarta.interfaces;

/*
Interface est une classe abstraite dont toutes les méthodes sont abstraites et dont tous les attributs sont constants :
- Interface sans corp sauf methode static
- C'est un contrat à respecter par les classes qui l'implémente
- Peut être implementé par un ou plusieurs Class
- sans constructeur
- extends par une ou plusieurs interface
 */
public class Main {
    public static void main(String[] args) {
        // Méthode static
        InterfaceMain.staticMethod();
        System.out.println();
        // Variable Static
        System.out.println("Static variable in Interface = " +Interface1.CONST);
        System.out.println();
        Interface1 interface1 = new Interface1Impl();
        System.out.println(interface1.mainMethod());
        System.out.println();
        Interface1.print();
        System.out.println();
        Interface2 interface2 = new Interface2Impl();
        System.out.println(interface2.toPrint());
        System.out.println(interface2.mainMethod());
        System.out.println(interface2.mainMethod2());
    }
}
