import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    int a,b,c,hcf,st;
	   Scanner in=new Scanner(System.in);
	   a=in.nextInt();
       b=in.nextInt();
       c=in.nextInt();
 
 	st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
 
	System.out.println(hcf);
	}
}