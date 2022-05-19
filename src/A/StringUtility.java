package A;

public class StringUtility {
    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversed += word.split("")[i];
        }
        return reversed;
    }
    public static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }
    public static String removeCharacter(String word, int index) {
        return word.substring(0, index) + word.substring(index + 1);
    }
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int i = 0;
        while(i < word2.length()) {
                if (word1.charAt(0) == word2.charAt(i)) {
                        word1 = removeCharacter(word1, 0);
                        word2 = removeCharacter(word2, i);
                        i = 0;
                        continue;
                    }
                i++;
            }
        return word1.length() == 0;
    }

    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
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