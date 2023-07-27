import java.util.*;

class Main {
    // Function to find the Greatest Common Divisor (GCD) of two numbers
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        HashMap<Character, Integer> mymap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            mymap.put(x, mymap.getOrDefault(x, 0) + 1);
        }

        int lcm = 1;
        for (int count : mymap.values()) {
            lcm = (lcm * count) / gcd(lcm, count);
        }

        System.out.print(lcm);
    }
}