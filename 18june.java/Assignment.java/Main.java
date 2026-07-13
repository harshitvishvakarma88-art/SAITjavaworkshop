class CourseStudent {
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100);
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }
}

public class Main {
    public static void main(String[] args) {
        CourseStudent s = new CourseStudent();

        s.setStudentName("Rahul");
        s.setCourseName("Java");
        s.setCourseFee(10000);
        s.setDiscountPercent(20);

        System.out.println("Student: " + s.getStudentName());
        System.out.println("Course: " + s.getCourseName());
        System.out.println("Final Fee: " + s.getFinalFee());
    }
}