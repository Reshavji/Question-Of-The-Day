import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       if(c*a>=b){
           System.out.print("Yes");
       }
       else{
           System.out.print("No");
       }
    }
}