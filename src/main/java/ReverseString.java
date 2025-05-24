public class ReverseString {

    public static String reverse(String str) {
        if (str == null) {
            return null; // Or throw an IllegalArgumentException, depending on desired behavior
        }
        return new StringBuilder(str).reverse().toString();
    }
}
