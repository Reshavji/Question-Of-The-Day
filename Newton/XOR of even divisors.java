import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int x=0;
        for(int i =2;i<=n;i=i+2){
            if(n%i==0 && i%2==0)
             x ^=i;
        }
        System.out.print(x);
    }
}