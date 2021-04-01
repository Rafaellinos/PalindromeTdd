package Palindrome;

public class PalindromeFinder {

    public static boolean isPalindrome(String word) {
        word = removeSpecialCharacters(word);
        StringBuilder stringBuilder = new StringBuilder(word);
        return word.equalsIgnoreCase(stringBuilder.reverse().toString());
    }

    public static String removeSpecialCharacters(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
