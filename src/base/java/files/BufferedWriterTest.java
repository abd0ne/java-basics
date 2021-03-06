package base.java.files;

import java.io.BufferedWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter("test.txt"))) {
            bufferedWriter.write("New line");
            bufferedWriter.newLine();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
