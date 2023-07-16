import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long m = sc.nextLong(); long count1=0, count2=0;
      while(n!=0 || m!=0){
         long x = n%2;
         long y =m%2;
         
           n =n/2;
           m=m/2;
           if(x!=y){
               count1++;
           }
      }
      System.out.print(count1);
    }
}