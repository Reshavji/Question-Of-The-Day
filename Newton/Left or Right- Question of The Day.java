import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int moves = getMinimumMoves(N);
        System.out.println(moves);
    }

    private static int getMinimumMoves(int N) {
        if (N == 0) {
            return 0;
        }
        else if(N==1){
            return 2;
        } else if (N < 0) {
            N = -N; // Convert negative N to positive for calculation
        }

        int minMoves = Integer.MAX_VALUE;

        // Try all possible combinations of 2 and 3 steps
        for (int i = 0; i <= N / 2; i++) {
            int steps2 = i;
            int steps3 = (N - (2 * steps2)) / 3;
            int currentMoves = steps2 + steps3;
            if ((2 * steps2 + 3 * steps3) == N && currentMoves < minMoves) {
                minMoves = currentMoves;
            }
        }

        return minMoves;
    }
}