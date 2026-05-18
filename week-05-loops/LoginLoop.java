public class LoginLoop {
    public static void main(String[] args) {
        String[] usernames = {"johan", "johan", "anna", "", "johan"};
        String[] passwords = {"secret123", "wrong", "secret123", "secret123", ""};

        for (int i = 0; i < usernames.length; i++) {
            String result = checkLogin(usernames[i], passwords[i]);

            System.out.println("Username: " + usernames[i] + ", Password: " + passwords[i] + " → " + result);
        }
    }

    public static String checkLogin(String username, String password) {
        if (username.equals("johan") && password.equals("secret123")) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}