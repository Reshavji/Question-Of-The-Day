import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();long count=0;
        while(num!=0){
           long x = num%10;
           if(x%2!=0){
               count+=x;
           }
           num =num/10;
        }
        for(int i =0;i<count;i++){
          System.out.print(8);
        }
        
    }
}