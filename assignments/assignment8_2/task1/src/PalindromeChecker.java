public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
