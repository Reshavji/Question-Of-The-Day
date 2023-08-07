import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     double x = sc.nextInt();
     double a = sc.nextInt();
     double y = sc.nextInt();
     double b = sc.nextInt();
     double res = ((x+y)/((x/a)+(y/b)));
     System.out.printf("%.2f",res);
    }
}