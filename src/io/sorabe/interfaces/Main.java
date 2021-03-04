package io.sorabe.interfaces;

/*
Interface est une classe abstraite dont toutes les méthodes sont abstraites
et tous les attributs sont constants :
- Interface sans corp sauf methode static
- C'est un contrat à respecter par les classes qui l'implémente
- Peut être implementé par un ou plusieurs Class
- sans constructeur
- extends par une ou plusieurs interface
 */
public class Main {
    public static void main(String[] args) {
        InterfaceMain.other();
        Interface1 interface1 = new Interface1Impl();
        System.out.println(interface1.main());
        System.out.println(Interface1.X);
        Interface1.print();
        Interface2 interface2 = new Interface2Impl();
        System.out.println(interface2.toPrint());
        System.out.println(interface2.main2());
        System.out.println("--------------No lambda--------------");
        InterfaceLambda interfaceNoLambda = new InterfaceLambda() {
            @Override
            public int show(int a, int b) {
                return a + b;
            }
        };
        System.out.println(interfaceNoLambda.show(1,2));
        System.out.println("--------------Lambda--------------");
        InterfaceLambda lambda = (a, b) -> a + b;
        System.out.println(lambda.show(1,2));
    }
}
