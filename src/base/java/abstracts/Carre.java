package base.java.abstracts;

public class Carre extends Forme {
    int cote = 4;
    @Override
    public double aire() {
        return cote*cote;
    }

    @Override
    protected String show() {
        return "Surface d'un carre = ";
    }
}
