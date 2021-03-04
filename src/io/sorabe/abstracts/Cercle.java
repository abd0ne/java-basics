package io.sorabe.abstracts;

public class Cercle extends Forme{
    @Override
    public double aire() {
        int r = 52;
        return Math.PI * r * r ;
    }

    @Override
    protected String show() {
        return "Surface d'un cercle = ";
    }
}
