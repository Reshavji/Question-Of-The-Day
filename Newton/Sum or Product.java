import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     long n = sc.nextLong(); long sum=0, pro=1; long ans=n;
     while(n!=0){
         long x = n%10;
         sum += x;
         pro *= x;
         n= n/10;
     }
     if(ans%2==0){
         System.out.print(sum);
     }
     else{
         System.out.print(pro);
     }
    }
}