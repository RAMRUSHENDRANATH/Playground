import java.util.Scanner;
class Main{
    public static void main(String args[]){
   int n, x,y, m= -1, t=-1,i = 0;
        Scanner s = new Scanner(System.in);
         n = s.nextInt();
        int a[] = new int[n];
  
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        x = s.nextInt();
        y= s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
               m=i;
            }
          if(a[i] == y)
            t=i;
        
         }
      System.out.println(m);
           System.out.println(t);

    }
}