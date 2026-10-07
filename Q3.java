import java.io.*;

public class Q3 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("destination.txt");

        int ch;
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully.");
    }
}