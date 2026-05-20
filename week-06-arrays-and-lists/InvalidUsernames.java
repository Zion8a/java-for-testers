public class InvalidUsernames {
    public static void main(String[] args) {
        String[] invalidUsernames = {"", " ", "verylongusername"};

        for (String username : invalidUsernames) {
            System.out.println("Testing invalid username: [" + username + "]");
        }
    }
}