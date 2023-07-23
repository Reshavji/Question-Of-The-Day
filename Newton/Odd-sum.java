import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int n1 = x+y;
    int n2 = y+z;
    int n3 = x+z;

    if(n1%2!=0 || n2%2!=0 || n3%2!=0){System.out.print("YES");}
            else{
                System.out.print("NO"); 
                }
    }
}