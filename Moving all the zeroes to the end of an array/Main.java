import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
     for(int i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
  	 }
      int j=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]!=0)
        {
          b[j]=a[i];
           j++;
        }
      }
      for(int i=0;i<n;i++)
      {
        System.out.print(b[i]+" ");
      }
    }
}