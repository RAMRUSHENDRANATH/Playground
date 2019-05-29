import java.util.Scanner;

class Main
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
      int y=s.nextInt();
      int prod=1,i,x,sum=0;
       int r=y;
      while(y>0)
      {
          x=y%10;
          y=y/10;
         for(i=x;i>0;i--)
         {
           prod=prod*i;
         }
       sum=sum+prod;
        prod=1;
      }
      if(r==sum)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
        
        
	}
}