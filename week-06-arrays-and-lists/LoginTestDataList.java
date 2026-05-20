import java.util.ArrayList;

public class LoginTestDataList {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        usernames.add("johan");
        passwords.add("secret123");

        usernames.add("johan");
        passwords.add("wrong");

        usernames.add("anna");
        passwords.add("secret123");

        usernames.add("");
        passwords.add("secret123");

        usernames.add("johan");
        passwords.add("");

        for (int i = 0; i < usernames.size(); i++) {
            String result = checkLogin(usernames.get(i), passwords.get(i));

            System.out.println("Username: [" + usernames.get(i) + "], Password: [" + passwords.get(i) + "] -> " + result);
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