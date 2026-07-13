public class UserRegistration {

    {
        System.out.println("Registration Process Started");
    }

    private String username;

    public UserRegistration() {
        this("Guest");
    }

    public UserRegistration(String username) {
        this.username = username;
        System.out.println("Username: " + this.username);
        System.out.println("Account Created Successfully");
    }

    public static void main(String[] args) {
        new UserRegistration("Rahul");
    }
}