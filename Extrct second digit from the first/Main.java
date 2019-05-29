import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int n,s;
          Scanner in=new Scanner(System.in);
         n=in.nextInt();
        while(n>100)
        {
          n=n/10;
        }
      s=n%10;
      System.out.println(s);
	}
}