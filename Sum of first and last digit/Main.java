import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int n,l,f,s;
          Scanner in=new Scanner(System.in);
         n=in.nextInt();
         l=n%10;
        while(n>=10)
        {
          n=n/10;
        }
        f=n;
       s=l+f;
      System.out.println(s);
	}
}