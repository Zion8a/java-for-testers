public class AgeCategoryMethod {
    public static void main(String[] args) {
        int age = 65;
        String category = getAgeCategory(age);

        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
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