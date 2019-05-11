import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int num , count;
Scanner in = new Scanner(System.in);
      num=in.nextInt();
      for (int i = 2; i<= num; i++) {
   count = 0;
   for (int j = 2; j <= i / 2; j++) {
    if (i % j == 0) {
     count++;
     break;
    }
   }

   if (count == 0) {
    System.out.println(i);
   }

  }
   }
	}
