import java.util.Scanner;
class Main{
	public static void main (String[] args){
        int n,i,fact=1;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      for(i=n;i>0;i--)
      {
        fact=fact*i;
      }
      System.out.println(fact);
	}
}