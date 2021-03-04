package ee.jakarta.abstracts;
/*
Classe abstract : classe qu'on ne peut pas instancier
Méthode abstract: méthode doit être redéfinie par les classes filles
 */
public class Main {
    public static void main(String[] args) {
        Forme carre = new Carre();
        Forme cercle = new Cercle();
        System.out.println();
        System.out.println(carre.show() + carre.aire());
        System.out.println();
        System.out.println(cercle.show() + cercle.aire());
    }
}
