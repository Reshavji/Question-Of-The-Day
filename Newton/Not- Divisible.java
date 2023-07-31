import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a + b;
        int q = s / (a - 1);
        int r = s % (a - 1);
        int res = a * q + r + (r == 0 ? -1 : 0);
        System.out.println(res);
    }
}