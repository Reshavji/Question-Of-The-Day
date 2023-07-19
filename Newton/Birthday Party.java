import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner sc =new Scanner(System.in);
      int n =sc.nextInt();
      int k =sc.nextInt();
      if(n%k==0){
          System.out.print(n/k);
      }
      else{
          if(n<k && k%n==0){
              System.out.print(1);
          }
          else{
          System.out.print(n);}
      }
    }
}