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
     int d = sc.nextInt();
     int e = sc.nextInt();
     if(a>e &&  b>e && c>e){
        System.out.print("no");
     }
     else if(((a+b<=d)&& c<=e) ||((a+c<=d) && b<=e) || ((b+c<=d) && a<=e)){
         System.out.print("yes");
     }
     else{
         System.out.print("no");
     }
    }
}