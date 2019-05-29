import java.util.Scanner;
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
    int r=sc.nextInt();
    int i,j,l;
    for(int k=1;k<=r;k++)
    {
      int temp=a[1];
      for( i=3;i<n;i=i+2)
      {
        a[i-2]=a[i];
      }
      a[i-2]=temp;
      if(n%2==1)
      {
       temp=a[i-1];
         l=i-1;
      }
      else
      {
          temp =a[i-3];
          l=i-3;
      }
      for( j=l;j>0;j=j-2)
      {
        a[j]=a[j-2];
      }
      a[0]=temp;
    }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
}
}