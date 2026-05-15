public class LoginCheck {
    public static void main(String[] args) {
        String username = "johan";
        String password = "secret123";

        if (username.equals("johan") && password.equals("secret123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
