import java.io.*;

public class Q6 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("text.txt");

        int count = 0;

        while (fr.read() != -1) {
            count++;
        }

        fr.close();

        System.out.println("Number of characters: " + count);
    }
}