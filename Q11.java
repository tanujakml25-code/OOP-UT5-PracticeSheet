import java.io.*;
import java.util.*;

public class Q11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();

        FileWriter fw = new FileWriter("student.txt");
        fw.write(name + "\n" + roll);
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("student.txt"));

        String studentName = br.readLine();
        String rollNumber = br.readLine();

        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);

        br.close();
    }
}