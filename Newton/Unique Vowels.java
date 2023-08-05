import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> myset = new HashSet<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch) && !myset.contains(ch)) {
                myset.add(ch);
            }
        }

        int uniqueVowelsCount = myset.size();
        System.out.println(uniqueVowelsCount);
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}