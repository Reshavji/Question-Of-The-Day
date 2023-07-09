import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc =new Scanner(System.in);
       int x = sc.nextInt();
       int p = sc.nextInt();
       int y = sc.nextInt();
       int q = sc.nextInt();
       int shyamspeed = x/p;
       int ramspeed = y/q;
       if(shyamspeed<ramspeed){
           System.out.print("Shyam");
       }
       else if(shyamspeed == ramspeed){
           System.out.print("Equal");
       }
       else{
           System.out.print("Ram");
       }
    }
}