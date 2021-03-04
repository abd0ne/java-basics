package io.sorabe.abstracts;

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
