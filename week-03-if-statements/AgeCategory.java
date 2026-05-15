public class AgeCategory {
    public static void main(String[] args) {
        int age = 17;

        if (age < 18) {
            System.out.println("Category: Child");
        } else if (age < 65) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior");
        }
    }
}
