package base.java.trywithresources;

public class MyResource implements ICloseable{
    @Override
    public void close() throws MyException {
        System.out.println("Resource closed");
    }
}
