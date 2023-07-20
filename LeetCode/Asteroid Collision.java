import java.util.*;

public class Main {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                // Positive asteroid, add to the stack
                stack.push(asteroid);
            } else {
                // Negative asteroid, check for collisions with asteroids moving to the right
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop(); // Destroy the smaller positive asteroid
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    // If the stack is empty or the top element is negative, add the negative asteroid
                    stack.push(asteroid);
                } else if (stack.peek() == -asteroid) {
                    // If the top element is equal to the negative asteroid, both asteroids will explode
                    stack.pop();
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids1 = {5, 10, -5};
        int[] result1 = asteroidCollision(asteroids1);
        System.out.println(Arrays.toString(result1)); // Output: [5, 10]

        int[] asteroids2 = {8, -8};
        int[] result2 = asteroidCollision(asteroids2);
        System.out.println(Arrays.toString(result2)); // Output: []

        int[] asteroids3 = {10, 2, -5};
        int[] result3 = asteroidCollision(asteroids3);
        System.out.println(Arrays.toString(result3)); // Output: [10]
    }
}
