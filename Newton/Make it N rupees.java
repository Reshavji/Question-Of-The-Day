import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Read input values
        long N = scanner.nextLong();
        long X = scanner.nextLong();

        // Check if it is possible to make N rupees
        String result = canMakeN(N, X);

        // Print the result
        System.out.println(result);
    }

    public static String canMakeN(long N, long X) {
        if (N % X == 0) {
            return "Yes";
        }
        for (long i = 1; i <= N / X; i++) {
            long remaining = N - (i * X);
            if (remaining % 2 == 0) {
                return "Yes";
            }
        }
        return "No";
    }
}
