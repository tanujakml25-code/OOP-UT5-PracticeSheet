import java.io.*;
import java.util.*;

class Student implements Serializable {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
public class Q12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();

        Student s = new Student(name, roll);

        ObjectOutputStream out =
            new ObjectOutputStream(new FileOutputStream("student.dat"));

        out.writeObject(s);
        out.close();

        System.out.println("Student object serialized successfully.");
    }
}