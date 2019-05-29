import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int sum=0,n,i=1;
          Scanner in=new Scanner(System.in);
       n=in.nextInt();
      while(i<=n)
      {
        sum=sum+i;
        i++;
      }
      System.out.println(sum);
	}
}