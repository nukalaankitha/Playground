import java.util.Scanner;
class Main
{
  public static int square_of_numbers(int n)
  {
     int  sqr;
     sqr=n*n;
    return sqr;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int m = in.nextInt();
      int son= square_of_numbers(m);
      m=son;
       System.out.print(m);
	} 
}