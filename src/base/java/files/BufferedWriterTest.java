package base.java.files;

import java.io.BufferedWriter;
import java.io.IOException;
/*
BufferedWriter écrit du texte vers un flux de sortie de caractères,
mettant en mémoire tampon les caractères pour une écriture efficace de caractères, de tableaux et de chaînes de caractères.
 */
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
