import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Q14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);

        ObjectOutputStream out =
            new ObjectOutputStream(new FileOutputStream("employee.dat"));

        out.writeObject(e);
        out.close();

        System.out.println("Employee object serialized successfully.");
    }
}