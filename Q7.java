import java.io.*;
import java.util.*;

public class Q7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        FileWriter fw = new FileWriter("notes.txt", true);
        fw.write(System.lineSeparator());
        fw.write(data);
        fw.close();

        System.out.println("Text appended successfully.");
    }
}