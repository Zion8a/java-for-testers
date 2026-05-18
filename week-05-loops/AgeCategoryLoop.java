public class AgeCategoryLoop {
    public static void main(String[] args) {
        int[] ages = {17, 18, 64, 65};

        for (int age : ages) {
            String category = getAgeCategory(age);

            System.out.println("Age: " + age + " → Category: " + category);
        }
    }

    public static String getAgeCategory(int age) {
        if (age < 18) {
            return "Child";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}