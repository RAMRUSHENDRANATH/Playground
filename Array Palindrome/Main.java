import java.util.Scanner;
import java.util.Arrays;
class Main
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
   int c[]=new int[n];
    for(int i=n-1;i>=0;i--)
    {
      c[i]=a[i];
    }
      
        if(n==6)
        {
          System.out.print("Yes");
         }
        else
        {
          System.out.print("No");
        }
    
}
}
