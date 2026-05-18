public class LoginMethod {
    public static void main(String[] args) {
        String username = "anna";
        String password = "secret123";

        String result = checkLogin(username, password);

        System.out.println("Result: " + result);
    }

    public static String checkLogin(String username, String password) {
        if (username.equals("johan") && password.equals("secret123")) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}
