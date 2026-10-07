import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        FileWriter fw = new FileWriter("message.txt");
        fw.write(data);
        fw.close();

        System.out.println("File written successfully.");
    }
}