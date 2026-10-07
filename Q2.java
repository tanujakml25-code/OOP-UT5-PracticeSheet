 import java.io.*;

public class Q2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("data.txt");

        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}