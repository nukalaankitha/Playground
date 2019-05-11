import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
     
      int n= in.nextInt();
      int r, col;
      int count=1;
      for(r=1;r<=n;r++)
      {
        for(col=1;col<=r;col++)
        {
              if(count%2==1)
      				System.out.print("*");
      		   else
                 System.out.print("#");
          count++;
        }
        System.out.print("\n");
      }
    }
}