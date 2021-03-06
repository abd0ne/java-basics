package base.java.files;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        // Avant Java 7
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("test.txt")));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        // try with resources Java7 + >>>> bufferedReader.close() auto
        try(BufferedReader bufferedReader1  = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = bufferedReader1.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
