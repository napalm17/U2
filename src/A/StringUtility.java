package A;

/**
 * This utility class contains various methods that work with strings.
 *
 * @author ugpsy
 * @version 1.0
 */
public class StringUtility {
    private StringUtility() {}

    /**
     * This method reverses the given string.
     *
     * @param word the string to be reversed.
     * @return the reversed word.
     */
    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversed += word.split("")[i];
        }
        return reversed;
    }
    /**
     * This boolean method checks if a given string is a palindrome.
     *
     * @param word the string to be inquired.
     * @return true if the given string is a palindrome, false if not.
     */
    public static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    /**
     * This method removes the character at the given index of the given string.
     *
     * @param word the string variable.
     * @param index the index of the character in the given string which is to be removed.
     * @return the string with the removed character at the given index.
     */
    public static String removeCharacter(String word, int index) {
        return word.substring(0, index) + word.substring(index + 1);
    }

    /**
     * This boolean method checks if two given words are anagrams.
     *
     * @param word1 given string 1
     * @param word2 given string 2
     * @return true if the given strings are anagrams, false if not.
     */
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false; // return false right away, if two words don't have same length.
        }
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word2.charAt(j) == word1.charAt(i)) {
                    word2 = removeCharacter(word2, j); // remove the common character found in both words from word 2
                }
            }
        }
        return word2.length() == 0; // If the word2 is basically empty by the end, then all characters were common.
                                    // so return true, false if not.
    }

    /**
     * This method capitalizes the first character of the given string.
     *
     * @param word the string variable.
     * @return the string with its first character capitalized.
     */
    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    /**
     * This method counts the number of occurrences of a given character in a given string.
     *
     * @param word the string variable.
     * @param character a char variable whose occurrence in "word" is going to be computed.
     * @return the number of occurrences of the given character in the given string.
     */
    public static int countCharacter(String word, char character) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }
}