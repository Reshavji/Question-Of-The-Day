import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Check if it is possible to construct the array
        if (isPossibleToConstructArray(N, X, Y)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPossibleToConstructArray(int N, int X, int Y) {
        int maxM = Y / N;
        int minM = (int) Math.ceil((double) X / N);

        for (int M = minM; M <= maxM; M++) {
            Set<Integer> gcdSet = new HashSet<>();
            for (int i = 1; i <= N; i++) {
                int gcd = gcd(i, M * i);
                if (gcdSet.contains(gcd)) {
                    break;
                }
                gcdSet.add(gcd);
            }

            if (gcdSet.size() == N) {
                return true;
            }
        }

        return false;
    }

    // Function to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}