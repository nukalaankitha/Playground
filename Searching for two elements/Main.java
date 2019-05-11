import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in = new Scanner(System.in);
      int as = in.nextInt();
      int arr[] = new int[as]; 
      int idx;
      for( idx=0; idx<= as-1; idx++)
      {
          arr[idx] = in.nextInt();
      }
            
    int search_elem_1 = in.nextInt();
    int search_elem_2 = in.nextInt();
    int elem_1_idx= -1;
    int elem_2_idx= -1;  
     for( idx=0; idx<= as-1; idx++)  
     {
          if(search_elem_1 == arr[idx] )
        {
        elem_1_idx = idx;
        
        }
      if( search_elem_2 ==arr[idx])
      {
            elem_2_idx = idx;  
      } 
     }
       System.out.println(elem_1_idx);
       System.out.println(elem_2_idx);
     }
    
}