import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count=0;
        while(x!=y){
            int num = y-x;
            if(num>1){
                x+=2;
                count++;
            }
            else{
                x+=1; 
                count++;
            }
        }
        System.out.print(count);
    }
}