import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length(); int count=0;
        for(int i = 0;i<n;i++){
            int num = s.charAt(i) -'0';
            if(num==7){
                count++;
            }
        }
        System.out.print(count);
    }
}