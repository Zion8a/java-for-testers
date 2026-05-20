public class ArrayLoopExample {
    public static void main(String[] args) {
        String[] usernames = {"johan", "anna", "testuser"};

        for (String username : usernames) {
            System.out.println("Testing username: " + username);
        }
    }
}
