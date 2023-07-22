import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void change(long n){
      while(n!=0){
        long m = n%10;
        n = n/10;
        int x = (int)m;
        switch(x){
            case 1:
            System.out.print("one ");
            break;
            case 2:
            System.out.print("two ");
            break;
            case 3:
            System.out.print("three ");
            break;
            case 4:
            System.out.print("four ");
            break;
            case 5:
            System.out.print("five ");
            break;
            case 6:
            System.out.print("six ");
            break;
            case 7:
            System.out.print("seven ");
            break;
            case 8:
            System.out.print("eight ");
            break;
            default:
            System.out.print("nine ");
            break;
        }
      } }
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong(); long ans = 0;
       if(n%2==0){
         while (n!=0){
           long m = n%10;
           ans = ans*10+m;
        n = n/10;
         }
         change(ans);
         }
         else{
         change(n);}
    }
}