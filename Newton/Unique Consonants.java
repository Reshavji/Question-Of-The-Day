import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> myset = new HashSet<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (isConsonant(ch) && !myset.contains(ch)) {
                myset.add(ch);
            }
        }

        int uniqueConsonantsCount = myset.size();
        System.out.println(uniqueConsonantsCount);
    }

    // Function to check if a character is a consonant
    private static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'b' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u');
    }
}