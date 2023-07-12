import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  int m = sc.nextInt();
  int n = sc.nextInt(); int c1=0,c2=0;
  int i=1; int ans1 =0,ans2=0;
  while(ans1<=m){
      ans1 +=i;
      i+=2;
      c1++;
  } int j=2;
  while(ans2<=n){
      ans2 +=j;
      j+=2;
      c2++;
  }
  if(c2>=c1){
      System.out.print("Milo");
  }
  else{
      System.out.print("Kiki");
  }
    }
}