public class AgeMethod {
    public static void main(String[] args) {
        String result = getAgeCategory(18);

        System.out.println(result);
    }

    public static String getAgeCategory(int age) {
        if (age >= 18) {
            return "Adult";
        } else {
            return "Child";
        }
    }
}