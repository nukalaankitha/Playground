import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int l, s, i;
      int a[]= new int[50];
      Scanner in = new Scanner(System.in);
      s= in.nextInt();
      for(i=0; i<s; i++)
      {
         a[i]= in.nextInt();
      }
      l=a[0];
      for(i=0; i<s; i++)
      {
         if(l<a[i])
         {
           l=a[i];
         }
      }
      System.out.print(l);
    }
}