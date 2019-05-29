import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int n,l,s=0;
          Scanner in=new Scanner(System.in);
         n=in.nextInt();
        while(n>0)
        {
          l=n%10;
          s=s+l;
          n=n/10;
        }
      System.out.println(s);
	}

	}
