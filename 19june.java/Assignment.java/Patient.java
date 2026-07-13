public class Patient {

    {
        System.out.println("Patient Registration Started");
    }

    private String name;
    private String disease;

    public Patient() {
        this("Unknown", "Not Diagnosed");
    }

    public Patient(String name) {
        this(name, "Not Diagnosed");
    }

    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;

        System.out.println("Patient: " + name);
        System.out.println("Disease: " + disease);
    }

    public static void main(String[] args) {
        new Patient("Rohan", "Fever");
    }
}