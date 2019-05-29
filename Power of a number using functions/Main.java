import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int b,e,s=1,i=1;
      Scanner in=new Scanner(System.in);
     b=in.nextInt();
     e=in.nextInt();
    while(i<=e)
    {
      s=s*b;
      i++;
    }
    System.out.println(s);
  }
}