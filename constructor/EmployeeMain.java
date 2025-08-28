package constructor;

class Employee {
    String name;
    int age;
    int salary;
    static String compName = "META";

    public Employee(String empname, int empage, int empsal) {
        name = empname;
        age = empage;
        salary = empsal;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", 23, 23000);
        System.out.println("Employee 1 name: " + e1.name);
        System.out.println("Employee 1 age: " + e1.age);
        System.out.println("Employee 1 salary: " + e1.salary);
        System.out.println("Employee 1 company: " + Employee.compName);
        System.out.println();

        Employee e2 = new Employee("Sam", 24, 37000);
        System.out.println("Employee 2 name: " + e2.name);
        System.out.println("Employee 2 age: " + e2.age);
        System.out.println("Employee 2 salary: " + e2.salary);
        System.out.println("Employee 2 company: " + Employee.compName);
        System.out.println();

        Employee e3 = new Employee("Vishal", 22, 21000);
        System.out.println("Employee 3 name: " + e3.name);
        System.out.println("Employee 3 age: " + e3.age);
        System.out.println("Employee 3 salary: " + e3.salary);
        System.out.println("Employee 3 company: " + Employee.compName);
        System.out.println();

    }

}