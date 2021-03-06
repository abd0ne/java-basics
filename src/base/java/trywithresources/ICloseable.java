package base.java.trywithresources;

public interface ICloseable extends AutoCloseable{
    void close() throws MyException;
}
