package base.java.generics;

public class Vehicle<T> {
    private T type;

    public Vehicle(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
