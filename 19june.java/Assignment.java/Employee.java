public class Employee {

    {
        System.out.println("Employee Registration Started");
    }

    private String name;
    private String department;

    public Employee() {
        this("Unknown", "Not Assigned");
    }

    public Employee(String name) {
        this(name, "Not Assigned");
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;

        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

    public static void main(String[] args) {
        new Employee("Raj", "IT");
    }
}