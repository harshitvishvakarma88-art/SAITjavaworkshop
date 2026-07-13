public class StudentResult {

    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public int getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks;
    }

    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public String getGrade() {
        double average = getAverage();

        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    // Main Method
    public static void main(String[] args) {

        StudentResult student = new StudentResult();

        student.setStudentName("Aditya");
        student.setMathMarks(95);
        student.setScienceMarks(88);
        student.setEnglishMarks(90);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Average: " + student.getAverage());
        System.out.println("Grade: " + student.getGrade());
    }
}