import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;
}

public class Q15 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in =
            new ObjectInputStream(new FileInputStream("employee.dat"));

        Employee e = (Employee) in.readObject();

        in.close();

        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }
}