package base.java.innerClasses;
/*
 // Classe anonyme est une classe déclarée au moment de l'instatiation de la classe contenante(AnonymousClass).
 */
public class AnonymousClass {
    public void createClass() {
        Message message = new Message(){
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
            public void display2() {
                System.out.println("Inside an anonymous class 2.");
            }
        };
        message.display();
        message.display2();
    }
}

// C'est possible d'utiliser une interface
class Message {
    public void display(){
    }
    public void display2() {
    }
}