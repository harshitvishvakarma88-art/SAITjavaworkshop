public class Admission {

    {
        System.out.println("Admission Process Started");
    }

    private String college = "ABC College";
    private String student;
    private String course;

    public Admission() {
        this("Unknown", "Not Assigned");
    }

    public Admission(String student) {
        this(student, "Not Assigned");
    }

    public Admission(String student, String course) {
        this.student = student;
        this.course = course;

        System.out.println("College: " + college);
        System.out.println("Student: " + student);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        new Admission("Neha", "MCA");
    }
}