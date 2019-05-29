import java.util.Scanner;
class Main {
	public static void main (String[] args){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int x=n;
     for(int i=1;i<=n;i++)
     {
         for(int j=1,k=1;k<n+1;j++,k++)
         {
             if(j==i||k==x)
             {
                 System.out.print("*");
             }
             else System.out.print(" ");
        
         }
         System.out.println();
         x--;
     }
     
	}
}