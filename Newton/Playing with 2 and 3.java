
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int steps = convertNum(N, M);
        System.out.println(steps);
    }

    private static int convertNum(int N, int M) {
        if (M % N != 0) {
            return -1;
        }

        int steps = 0;
        int div = M / N;
        while (div > 1 && div % 2 == 0) {
            div /= 2;
            steps++;
        }
        while (div > 1 && div % 3 == 0) {
            div /= 3;
            steps++;
        }
        if (div != 1) {
            return -1;
        }
        return steps;
        }
    }