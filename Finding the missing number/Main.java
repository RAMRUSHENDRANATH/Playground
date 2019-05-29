import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      for(int j=1;j<=n;j++)
      {
        int c=0;
        for(int i=0;i<n;i++)
        {
          if(a[i]==j)
          {
            c++;
          }
        }
         if(c==0)
         {
           System.out.print(j);
         }
      }
         }
}