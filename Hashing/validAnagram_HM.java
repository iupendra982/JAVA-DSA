import java.util.*;

public class validAnagram_HM {
    public static boolean validAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency maps
        HashMap<Character, Integer> tm1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            tm1.put(c, tm1.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> tm2 = new HashMap<>();
        for (char c : s2.toCharArray()) {
            tm2.put(c, tm2.getOrDefault(c, 0) + 1);
        }

        return tm1.equals(tm2);
    }

    public static void main(String[] args) {
        String a = "race";
        String b = "care";
        System.out.println(validAnagram(a, b)); // ✅ true
    }
}
