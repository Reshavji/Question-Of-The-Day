import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       int n= str.length(); int sum1=0, sum2=0;
       for(int i= 0;i<n;i++){ 
           char c = str.charAt(i);
           int x = c-'0';
           if(x%2==0){
               sum1+=x;
           }
           else{
               sum2+=x;
           }
           }
           int ans = sum1*sum2;
           System.out.print(ans);
    }
}