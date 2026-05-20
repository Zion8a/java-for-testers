import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();

        usernames.add("johan");
        usernames.add("anna");
        usernames.add("testuser");

        for (String username : usernames) {
            System.out.println("Username: " + username);
        }
    }
}
