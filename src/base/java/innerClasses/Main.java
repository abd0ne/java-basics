package base.java.innerClasses;
/*
La classe interne est déclarée à l'intérieur d'une autre classe.
Elle peut donc accéder aux membres de la classe contenante.
 */
public class Main {
    public static void main(String[] args) {
        // Classe interne static
        OuterClass.StaticNestedClass.hello();
        // Classe interne non-static
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.hello();
        // Classe anonyme
        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.createClass();
    }
}
