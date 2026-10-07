import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        FileOutputStream fos = new FileOutputStream("data.txt");
        fos.write(data.getBytes());
        fos.close();

        System.out.println("Data written successfully.");
    }
}