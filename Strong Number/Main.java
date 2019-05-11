import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp,sum=0, a;
      temp=n;
      while(n>0)
      {
      a=n%10;
      sum= sum+fact(a);
      n=n/10;
      }
      if(temp==sum)
      {
      System.out.println("Yes");
      }
      else
      {
      System.out.println("No");
      }
	}
  public static int fact(int num)
  {
  int fact=1;
  for(int i=1;i<=num;i++)
  {
  fact*=i;
  }
  return fact;
  }
}