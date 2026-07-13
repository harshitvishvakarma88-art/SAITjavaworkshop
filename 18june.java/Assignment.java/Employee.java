public class Employee {

    private String employeeName;
    private double salary;
    private int yearsOfService;

    // Setters
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Getters
    public String getEmployeeName() {
        return employeeName;
    }

    public double getFinalSalary() {

        double bonus;

        if (yearsOfService >= 10) {
            bonus = salary * 20 / 100;
        } 
        else if (yearsOfService >= 5) {
            bonus = salary * 10 / 100;
        } 
        else {
            bonus = salary * 5 / 100;
        }

        return salary + bonus;
    }

    // Main Method
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmployeeName("Aditya");
        emp.setSalary(50000);
        emp.setYearsOfService(8);

        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Final Salary with Bonus: ₹" + emp.getFinalSalary());
    }
}