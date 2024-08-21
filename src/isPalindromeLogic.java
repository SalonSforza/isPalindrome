
public class isPalindromeLogic {
    public static boolean isPalindrome(String text) {
        StringBuilder sb1 = new StringBuilder(text.replaceAll("[^A-Za-z0-9]", "").toLowerCase());
        return sb1.toString().equals(sb1.reverse().toString());

    }





}
