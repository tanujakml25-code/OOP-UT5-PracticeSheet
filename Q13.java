import java.io.*;

class Student implements Serializable {
    String name;
    int roll;
}

public class Q13 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in =
            new ObjectInputStream(new FileInputStream("student.dat"));

        Student s = (Student) in.readObject();

        in.close();

        System.out.println("Student Details:");
        System.out.println("Name: " + s.name);
        System.out.println("Roll Number: " + s.roll);
    }
}